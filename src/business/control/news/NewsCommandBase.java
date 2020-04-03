package business.control.news;

import util.Command;
import util.InvalidArgumentsException;

public abstract class NewsCommandBase implements Command {
    protected final NewsControlInterface control;

    public NewsCommandBase(NewsControlInterface nci) {
        this.control = nci;
    }

    protected static void requireArgumentsLength(int expected, int real) {
        if (expected != real)
            throw new InvalidArgumentsException(expected, real);
    }
}