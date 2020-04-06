package infra;

/**
 * Adapter para avaliação do Câmbio.
 * Classe Singleton e Adapter.
 */
public class ExchangeRateAdapter extends ExchangeRate {
    private static ExchangeRateAdapter instance;
    
    protected ExchangeRateAdapter() {
        super();
    }

    public synchronized static ExchangeRateAdapter getInstance() {
        if (instance == null)
            instance = new ExchangeRateAdapter();
        return instance;
    }

}