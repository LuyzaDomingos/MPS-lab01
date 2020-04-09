package business.model;

import java.util.ArrayList;

/**
 * Implemntação do Zelador do Memento para News
 * @author luyza
 */
public class NewsCaretaker {
    private ArrayList<NewsMemento> mementoCategories = new ArrayList<>();
    private ArrayList<NewsMemento> mementoContent = new ArrayList<>();
    private ArrayList<NewsMemento> mementoTimeUpdated = new ArrayList<>();
    
    
    public void addMementoCategories(NewsMemento mementocategories){
      mementoCategories.add(mementocategories);  
    }
    
    public void addMementoContent(NewsMemento mementocontent){
      mementoContent.add(mementocontent);  
    }
    
    public void addMementoTimeUpdated(NewsMemento mementotime){
      mementoTimeUpdated.add(mementotime);  
    }
    
    public NewsMemento getLastetSaveCategories(){
        if(mementoCategories.size()<=0){
            return null;
        }
        return mementoCategories.remove(mementoCategories.size()-1);
    }
    
    public NewsMemento getLastetSaveContent(){
        if(mementoContent.size()<=0){
            return null;
        }
        return mementoContent.remove(mementoContent.size()-1);
    }
    
    public NewsMemento getLastetSaveTime(){
        if(mementoTimeUpdated.size()<=0){
            return null;
        }
        return mementoTimeUpdated.remove(mementoTimeUpdated.size()-1);
    }
    
}
