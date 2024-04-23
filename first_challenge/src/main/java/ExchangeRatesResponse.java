import java.util.Map;

class ExchangeRatesResponse {
    private final String baseCurrency;
    private final Map<String, Double> rates;

    public ExchangeRatesResponse(String baseCurrency, Map<String, Double> rates) {
        this.baseCurrency = baseCurrency;
        this.rates = rates;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public Map<String, Double> getRates() {
        return rates;
    }
}