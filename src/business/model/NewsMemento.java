package business.model;

import java.time.LocalDateTime;
import java.util.Set;

/**
 * Implemntação do Padrão de Projeto Memento para a entidade News
 * @author luyza
 */
public class NewsMemento {
    
    private Set<String> stateCategories;
    private String stateContent;
    private LocalDateTime statetimeUpdated;
    
    public NewsMemento(Set<String> stateCategories){
        this.stateCategories = stateCategories;
    }
    
    public NewsMemento(String stateContent){
        this.stateContent = stateContent;
    }
    
    public NewsMemento(LocalDateTime statetimeUpdated){
        this.statetimeUpdated = statetimeUpdated;
    }
    
    public Set<String> getStateCategoriesSave(){
        return stateCategories;
    }
    
    public String getStateContentSave(){
        return stateContent;
    }
    
    public LocalDateTime getStateTimeUpdatedSave(){
        return statetimeUpdated;
    }
    
    
}
