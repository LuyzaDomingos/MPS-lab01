package business.model;

import java.util.ArrayList;

/**
 * Implemntação do Zelador do Memento para News
 * @author luyza
 */
public class NewsCaretaker {
    private ArrayList<NewsMemento> mementoStates = new ArrayList<>();
    
    
    public void addMemento(NewsMemento mementostate){
      mementoStates.add(mementostate);  
    }
    
    public NewsMemento getLastetSaveState(){
        if(mementoStates.size()<=0){
            return null;
        }
        return mementoStates.remove(mementoStates.size()-1);
    }
 
}
