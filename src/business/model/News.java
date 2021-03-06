package business.model;

import java.time.LocalDateTime;
import java.util.Set;

public class News implements NewsInterface {

    private Set<UserInterface> authors;
    private Set<String> categories;
    private String content;
    private LocalDateTime timePosted, timeUpdated;
    private NewsCaretaker caretakerTotal;
    

    public News(String content, Set<UserInterface> authors, Set<String> categories) {
        this.authors = authors;
        this.categories = categories;
        this.content = content;
        this.timePosted = this.timeUpdated = LocalDateTime.now();
        this.caretakerTotal = new NewsCaretaker();
          
    }

    @Override
    public Set<UserInterface> getAuthors() {
        return authors;
    }

    @Override
    public Set<String> getCategories() {
        return categories;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public LocalDateTime getPostedTime() {
        return timePosted;
    }

    @Override
    public LocalDateTime getUpdatedTime() {
        return timeUpdated;
    }
    
    public void outDatedCategories(){
        categories = caretakerTotal.getLastetSaveState().getStateCategoriesSave();
    }
    
    public void outDatedContent(){
        content = caretakerTotal.getLastetSaveState().getStateContentSave();
    }
    
    public void outDatedTime(){
        timeUpdated = caretakerTotal.getLastetSaveState().getStateTimeUpdatedSave();
    }
    
}