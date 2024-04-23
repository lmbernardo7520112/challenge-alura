### Currency Converter 💱

Welcome to the Currency Converter project! This Java application allows you to convert currencies using real-time exchange rates obtained from an API. 🔄

#### Classes 📚

1. **Currency**

   - This class represents a currency with a code and a name.
   - Attributes:
     - `code`: The currency code.
     - `name`: The name of the currency.
   - Methods:
     - `getCode()`: Returns the currency code.
     - `getName()`: Returns the name of the currency.

2. **ExchangeRatesResponse**

   - This class represents a response object containing exchange rates.
   - Attributes:
     - `baseCurrency`: The base currency for the exchange rates.
     - `rates`: A map containing currency codes as keys and exchange rates as values.
   - Methods:
     - `getBaseCurrency()`: Returns the base currency.
     - `getRates()`: Returns the map of currency codes and exchange rates.

#### Functionality ⚙️

The `ConversorMoedas` class provides the main functionality of the application. It interacts with an external API to fetch exchange rates and allows users to convert currencies based on the obtained rates.

#### How to Use 🚀

1. Clone the repository to your local machine.
2. Compile the Java files using `javac *.java`.
3. Run the application using `java ConversorMoedas`.
4. Follow the on-screen instructions to select source and target currencies, enter the amount to convert, and view the converted amount.

#### Dependencies 📦

This project relies on the following external libraries:

- [Gson](https://github.com/google/gson): A Java library for JSON serialization and deserialization. It is used to parse JSON responses from the exchange rate API.

#### Contributing 🤝

Contributions to this project are welcome! If you'd like to contribute, please follow the guidelines outlined in the [CONTRIBUTING.md](CONTRIBUTING.md) file.

#### License 📜

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

#### Contact 📧

If you have any questions or suggestions regarding this project, feel free to contact us at [leonardo.bernardo@professor.pb.gov.br](mailto:leonardo.bernardo@professor.pb.gov.br).

Thank you for using the Currency Converter! Happy converting! 🎉
