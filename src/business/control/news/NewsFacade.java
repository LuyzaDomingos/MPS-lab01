package business.control.news;

import java.util.HashMap;
import java.util.Map;
import util.Command;
import util.InvalidCommandException;

public class NewsFacade {
    final private NewsControl control;
    final private Map<String, Command> commands;

    public NewsFacade() {
        this.control = new NewsControl();
        this.commands = new HashMap<>();
        
        this.commands.put("add", new AddCommand(control));
        this.commands.put("create", new CreateCommand(control));
        this.commands.put("fromAuthor", new FromAuthorCommand(control));
        this.commands.put("fromTimeRange", new FromTimeRangeCommand(control));
        this.commands.put("ofCategory", new OfCategoryCommand(control));
        this.commands.put("getAll", new GetAllCommand(control));
        this.commands.put("get", new GetCommand(control));
        this.commands.put("remove", new RemoveCommand(control));
    }

    public Object executeCommand(String command, Object... args) {
        Command comm = this.commands.get(command);
        if (comm == null)
            throw new InvalidCommandException(command + " não é um comando válido.");
        return comm.execute(args);
    }
}
