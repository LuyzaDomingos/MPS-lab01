package infra;

import org.json.simple.parser.ParseException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import util.ExternalServiceException;

/**
 * Usa o serviço exchangeratesapi.io para obter a cotação do dia.
 */
public class ExchangeRate {
    private static final String API_URL = "https://api.exchangeratesapi.io/latest?base=";

    public ExchangeRate() {
    }

    protected String fetchURL(String rate) throws ExternalServiceException {
        return URLDownloader.fetchURL(API_URL + rate,
                "Erro ao acessar o serviço externo de câmbio. Tente novamente mais tarde.");
    }

    protected double parseRate(String source, String rate) throws ExternalServiceException {
        try {
            var parser = new JSONParser();
            var rootDict = (JSONObject) parser.parse(source);
            var rates = (JSONObject) rootDict.get("rates");
            return (double) rates.get(rate);
        } catch (ParseException e) {
            throw new ExternalServiceException(
                    "Parece ter ocorrido mudanças no serviço externo de câmbio. Tente novamente mais tarde.", e);
        }
    }

    /**
     * Obtém a cotação do dia para a moeda desejada, com a moeda base definida.
     * 
     * @param to   Moeda a ser cotada.
     * @param base Moeda base
     * @return Valor de "to" equivalente a uma unidade de "base"
     * @throws ExternalServiceException Usualmente problemas de rede,
     *                                  disponibilidade da API do serviço ou
     *                                  mudanças na infraestrutura do mesmo.
     */
    public double getExchangeRate(String to, String base) throws ExternalServiceException {
        return parseRate(fetchURL(base), to);
    }

    /**
     * Obtém a cotação do dia para a moeda desejada, com base no Dólar Americano.
     * 
     * @param to Moeda a ser cotada.
     * @return Valor de "to" equivalente a uma unidade do Dólar Americano.
     * @throws ExternalServiceException Usualmente problemas de rede,
     *                                  disponibilidade da API do serviço ou
     *                                  mudanças na infraestrutura do mesmo.
     */
    public double getExchangeRate(String to) throws ExternalServiceException {
        return getExchangeRate(to, "USD");
    }
}