package business.control.news;

import business.model.NewsInterface;

public class OfCategoryCommand extends NewsCommandBase {

    public OfCategoryCommand(NewsControlInterface nci) {
        super(nci);
    }

    @Override
    public Iterable<NewsInterface> execute(Object... args) {
        requireArgumentsLength(1, args.length);
        return control.getAllNewsOfCategory((String)args[0]);
    }

}