package business.control.news;

import business.model.NewsInterface;

public class AddCommand extends NewsCommandBase {

    public AddCommand(NewsControlInterface nci) {
        super(nci);
    }

    /**
     * Retorno: O mesmo que NewsControlInterface.addNews. (int)
     */
    @Override
    public Object execute(Object... args) {
        requireArgumentsLength(1, args.length);
        return control.addNews((NewsInterface)args[0]);
    }

}