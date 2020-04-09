package business.control;

import java.util.Date;
import infra.AuthLogger;
import util.InfraException;
import business.model.UserSession;
import util.AuthException;
import util.InvalidLoginException;
import util.InvalidPasswordException;

/**
 * Fachada das Classes de Controle
 * 
 * @author Victor Koehler
 */
public class ControlFacade {
    private final UserControl userControl;
    private final GameControl gameControl;

    public ControlFacade() throws InfraException {
        this.userControl = new UserControl();
        this.gameControl = new GameControl();
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
    
    public void addGame(String login, String titulo, float preco, Date dataLancamento) throws InvalidLoginException, InfraException{
        gameControl.addGame(login, titulo, preco, dataLancamento);
    }
    
    public void deleteGame(String login, String gameTitulo) throws InfraException{
        gameControl.deleteGame(login, gameTitulo);
    }

    public business.model.UserSession authUser(String user, String password) throws AuthException {
        UserSession us = new UserSession(getUser(user), password);
        AuthLogger.getInstance().log(us);
        if (!us.isValid())
            throw new AuthException();
        return us;
    }
}