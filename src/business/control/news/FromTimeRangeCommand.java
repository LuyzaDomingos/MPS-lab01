package business.control.news;

import java.time.LocalDateTime;
import business.model.NewsInterface;
import util.InvalidArgumentsException;

public class FromTimeRangeCommand extends NewsCommandBase {

    public FromTimeRangeCommand(NewsControlInterface nci) {
        super(nci);
    }

    @Override
    public Iterable<NewsInterface> execute(Object... args) {
        if (args.length == 0 || args.length > 2)
            throw new InvalidArgumentsException(String.format("1 ou 2 argumentos necessários. %d fornecidos.", args.length));
        LocalDateTime end = args.length == 2 ? (LocalDateTime)args[1] : LocalDateTime.now();
        return control.getAllNewsFromDateTimeRange((LocalDateTime)args[0], end);
    }

}