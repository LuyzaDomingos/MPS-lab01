package business.model;

import java.time.LocalDateTime;
import java.util.Set;

public class News implements NewsInterface {

    private Set<UserInterface> authors;
    private Set<String> categories;
    private String content;
    private LocalDateTime timePosted, timeUpdated;
    private NewsCaretaker caretakerCategories;
    private NewsCaretaker caretakerContent;
    private NewsCaretaker caretakerTime;
    

    public News(String content, Set<UserInterface> authors, Set<String> categories) {
        this.authors = authors;
        this.categories = categories;
        this.content = content;
        this.timePosted = this.timeUpdated = LocalDateTime.now();
        this.caretakerCategories = new NewsCaretaker();
        this.caretakerContent = new NewsCaretaker();
        this.caretakerTime = new NewsCaretaker();
                
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
        categories = caretakerCategories.getLastetSaveCategories().getStateCategoriesSave();
    }
    
    public void outDatedContent(){
        content = caretakerContent.getLastetSaveContent().getStateContentSave();
                ;
    }
    
    public void outDatedTime(){
        timeUpdated = caretakerTime.getLastetSaveTime().getStateTimeUpdatedSave();
    }
    
}