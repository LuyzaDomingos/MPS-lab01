package business.model;

/**
 * Construção de uma operação financieira.
 * @author luyza
 */
public class FinancialDirector {
    protected FinancialBuilder operations;
    
    public FinancialDirector(FinancialBuilder operations){
        this.operations = operations;
    }
    
    public void build(){
        operations.buildName();
        operations.buildKey();
        operations.buildValue();
        operations.buildRisk();
    }
    
    public Financial getFinancial(){
        return operations.getFinancial();
    }
            
   
    
    
}
