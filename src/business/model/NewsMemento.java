package business.model;

import java.util.Set;

/**
 * Implemntação do Padrão de Projeto Memento para a entidade News
 * @author luyza
 */
public class NewsMemento {
    protected Set<String> stateCategorie; // o estado é a categoria
    
    public NewsMemento(Set<String> state){
        stateCategorie = state;
    }
    
    public Set<String> getStateCategorieSave(){
        return stateCategorie;
    }
}
