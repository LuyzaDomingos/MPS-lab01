package business.control;

import infra.InfraException;
import util.InvalidLoginException;
import util.InvalidPasswordException;

/**
 * Fachada das Classes de Controle
 * 
 * @author Victor Koehler
 */
public class ControlFacade {
    private final UserControl userControl;

    public ControlFacade() throws InfraException {
        this.userControl = new UserControl();
    }

    public void addUser(String login, String password) throws InvalidLoginException, InvalidPasswordException, InfraException {
        userControl.addUser(login, password);
    }

    public void deleteUser(String login) throws InfraException {
        userControl.deleteUser(login);
    }

    public business.model.UserInterface getUser(String login) {
        return userControl.getUser(login);
    }
}