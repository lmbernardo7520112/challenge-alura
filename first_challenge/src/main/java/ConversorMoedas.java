import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConversorMoedas {
    private static final String API_BASE_URL = "https://v6.exchangerate-api.com/v6/a164a28b5540ae0a5488f009/latest/";

    private static String getExchangeRatesFromApi(String baseCurrencyCode) throws IOException {
        String apiUrl = API_BASE_URL + baseCurrencyCode;
        URL url = new URL(apiUrl);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        // Convert InputStream to String
        BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
        }
        reader.close();

        // Convert to JSON
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(stringBuilder.toString());
        JsonObject jsonObject = root.getAsJsonObject();

        // Convert JsonObject to String
        return jsonObject.toString();
    }

    private static Map<String, Double> parseExchangeRates(String json) {
        JsonParser parser = new JsonParser();
        JsonObject jsonObject = parser.parse(json).getAsJsonObject();

        JsonObject ratesObject = jsonObject.getAsJsonObject("conversion_rates");
        Map<String, Double> rates = new HashMap<>();
        for (Map.Entry<String, JsonElement> entry : ratesObject.entrySet()) {
            rates.put(entry.getKey(), entry.getValue().getAsDouble());
        }

        return rates;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String json = getExchangeRatesFromApi("USD");
            Map<String, Double> exchangeRates = parseExchangeRates(json);

            if (exchangeRates.isEmpty()) {
                System.out.println("Failed to load exchange rates.");
                return;
            }

            while (true) {
                // Prompt user to select source currency
                System.out.println("Choose the source currency:");
                for (String currencyCode : exchangeRates.keySet()) {
                    System.out.println(currencyCode);
                }
                System.out.print("Enter the source currency code: ");
                String sourceCurrencyCode = scanner.next().toUpperCase(); // Convert input to uppercase

                if (!exchangeRates.containsKey(sourceCurrencyCode)) {
                    System.out.println("Invalid source currency.");
                    continue;
                }

                // Prompt user to select target currency
                System.out.println("Choose the target currency:");
                for (String currencyCode : exchangeRates.keySet()) {
                    if (!currencyCode.equals(sourceCurrencyCode)) {
                        System.out.println(currencyCode);
                    }
                }
                System.out.print("Enter the target currency code: ");
                String targetCurrencyCode = scanner.next().toUpperCase(); // Convert input to uppercase

                if (!exchangeRates.containsKey(targetCurrencyCode)) {
                    System.out.println("Invalid target currency.");
                    continue;
                }

                // Prompt user to enter amount to convert
                System.out.print("Enter the amount to convert: ");
                double amount = scanner.nextDouble();

                // Perform currency conversion
                double sourceRate = exchangeRates.get(sourceCurrencyCode);
                double targetRate = exchangeRates.get(targetCurrencyCode);
                double convertedAmount = (amount / sourceRate) * targetRate;

                System.out.println(amount + " " + sourceCurrencyCode + " is equivalent to " + convertedAmount + " " + targetCurrencyCode);

                // Ask if the user wants to do another conversion
                System.out.print("Do you want to do another conversion? (yes/no): ");
                String response = scanner.next().toLowerCase();
                if (!response.equals("yes")) {
                    break;
                }
            }
        } catch (IOException e) {
            System.err.println("Error fetching exchange rates from API.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
