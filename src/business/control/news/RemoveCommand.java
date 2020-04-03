package business.control.news;

import business.model.NewsInterface;

public class RemoveCommand extends NewsCommandBase {

    public RemoveCommand(NewsControlInterface nci) {
        super(nci);
    }

    @Override
    public Object execute(Object... args) {
        requireArgumentsLength(1, args.length);
        if (args[0] instanceof NewsInterface) {
            control.removeNews((NewsInterface)args[0]);
        } else {
            control.removeNews((int)args[0]);
        }
        return null;
    }

}