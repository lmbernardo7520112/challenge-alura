### Currency Converter 💱

#### [English](#english) | [Português](#portuguese)

---

### <a name="english"></a> English

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

#### Contact 📧

If you have any questions or suggestions regarding this project, feel free to contact us at [leonardo.bernardo@professor.pb.gov.br](mailto:leonardo.bernardo@professor.pb.gov.br).

Thank you for using the Currency Converter! Happy converting! 🎉

---

### <a name="portuguese"></a> Português

Bem-vindo ao projeto Conversor de Moedas! Este aplicativo Java permite que você converta moedas usando taxas de câmbio em tempo real obtidas de uma API. 🔄

#### Classes 📚

1. **Moeda**

   - Esta classe representa uma moeda com um código e um nome.
   - Atributos:
     - `code`: O código da moeda.
     - `name`: O nome da moeda.
   - Métodos:
     - `ggetCode()`: Retorna o código da moeda.
     - `getName()`: Retorna o nome da moeda.

2. **RespostaTaxasCambio**

   - Esta classe representa um objeto de resposta contendo taxas de câmbio.
   - Atributos:
     - `baseCurrency`: A moeda base para as taxas de câmbio.
     - `rates`: Um mapa contendo códigos de moeda como chaves e taxas de câmbio como valores.
   - Métodos:
     - `getBaseCurrency()`: Retorna a moeda base.
     - `getRates()`: Retorna o mapa de códigos de moeda e taxas de câmbio.

#### Funcionalidade ⚙️

A classe `ConversorMoedas` fornece a funcionalidade principal do aplicativo. Ele interage com uma API externa para buscar taxas de câmbio e permite que os usuários convertam moedas com base nas taxas obtidas.

#### Como Usar 🚀

1. Clone o repositório para sua máquina local.
2. Compile os arquivos Java usando `javac *.java`.
3. Execute o aplicativo usando `java ConversorMoedas`.
4. Siga as instruções na tela para selecionar moedas de origem e destino, inserir o valor a ser convertido e visualizar o valor convertido.

#### Dependências 📦

Este projeto depende das seguintes bibliotecas externas:

- [Gson](https://github.com/google/gson): Uma biblioteca Java para serialização e desserialização JSON. É usada para analisar respostas JSON da API de taxa de câmbio.

#### Contribuições 🤝

Contribuições para este projeto são bem-vindas! Se você gostaria de contribuir, siga as diretrizes descritas no arquivo [CONTRIBUTING.md](CONTRIBUTING.md).

#### Contato 📧

Se você tiver alguma dúvida ou sugestão sobre este projeto, sinta-se à vontade para entrar em contato conosco em [leonardo.bernardo@professor.pb.gov.br](mailto:leonardo.bernardo@professor.pb.gov.br).

Obrigado por usar o Conversor de Moedas! Feliz conversão! 🎉
