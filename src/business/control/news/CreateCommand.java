package business.control.news;

import java.util.Set;

import business.model.News;
import business.model.UserInterface;

public class CreateCommand extends NewsCommandBase {

    public CreateCommand(NewsControlInterface nci) {
        super(nci);
    }

    public int action(String content, Set<UserInterface> authors, Set<String> categories) {
        return control.addNews(new News(content, authors, categories));
    }

    @Override
    public Object execute(Object... args) {
        requireArgumentsLength(3, args.length);
        return action((String)args[0], (Set<UserInterface>)args[1], (Set<String>)args[2]);
    }

}