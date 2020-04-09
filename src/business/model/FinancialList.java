package business.model;

/**
 * Personalização de uma operação financeira.
 * @author luyza
 */
public class FinancialList extends FinancialBuilder{
    
    @Override
    public void buildName(){
        financial.name = "Joao";
    }
    
    @Override
    public void buildValue(){
       financial.value = 150.00; 
    }
    
    @Override
    public void buildKey(){
        financial.key = 001;
    }
    
    @Override
    public void buildRisk(){
        financial.risk = "MenorGrau";
        
    }
    
}
