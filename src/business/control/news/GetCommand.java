package business.control.news;

import business.model.NewsInterface;

public class GetCommand extends NewsCommandBase {

    public GetCommand(NewsControlInterface nci) {
        super(nci);
    }

    @Override
    public NewsInterface execute(Object... args) {
        requireArgumentsLength(1, args.length);
        return control.getNews((int)args[0]);
    }

}