package business.control.news;

import business.model.NewsInterface;

public class GetAllCommand extends NewsCommandBase {

    public GetAllCommand(NewsControlInterface nci) {
        super(nci);
    }

    @Override
    public Iterable<NewsInterface> execute(Object... args) {
        return control.getAllNews();
    }

}