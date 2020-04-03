package business.control.news;

import business.model.NewsInterface;
import business.model.UserInterface;

public class FromAuthorCommand extends NewsCommandBase {

    public FromAuthorCommand(NewsControlInterface nci) {
        super(nci);
    }

    @Override
    public Iterable<NewsInterface> execute(Object... args) {
        requireArgumentsLength(1, args.length);
        return control.getAllNewsFromAuthor((UserInterface)args[0]);
    }

}