package business.model;

/**
 * Classe abstrata na qual possui um método para a cosntrução de cada elemento
 * @author luyza
 */
public abstract class FinancialBuilder {
    
    protected Financial financial;  
    
    public FinancialBuilder(){
        financial  = new Financial();
    }
    
    public abstract void buildName();
    
    public abstract void buildValue();
    
    public abstract void buildKey();
    
    public abstract void buildRisk();
    
    public Financial getFinancial(){
        return financial;
    }
}
