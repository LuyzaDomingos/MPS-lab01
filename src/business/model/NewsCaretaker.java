package business.model;

import java.util.ArrayList;

/**
 * Implemntação do Zelador do Memento para News
 * @author luyza
 */
public class NewsCaretaker {
    protected ArrayList<NewsMemento> mementoStates;
    
    public NewsCaretaker(){
        mementoStates = new ArrayList<>();
    }
    
    public void addMemento(NewsMemento memento){
      mementoStates.add(memento);  
    }
    
    public NewsMemento getLastetStateSave(){
        if(mementoStates.size()<=0){
            return null;
        }
        return mementoStates.remove(mementoStates.size()-1);
    }
    
}
