package infra.auth;

import java.util.ArrayList;
import java.util.List;
import business.model.UserInterface;
import util.AuthException;

/**
 * Gerência e Registra eventos relacionados a autenticação.
 * 
 * @author Victor Koehler
 */

public class SessionController {

    private final List<UserSessionInterface> history;

    /**
     * Singleton
     */
    private static SessionController instance;

    protected SessionController() {
        history = new ArrayList<>();
    }

    /**
     * @return Singleton
     */
    public static synchronized SessionController getInstance() {
        if (instance == null) {
            instance = new SessionController();
        }
        return instance;
    }

    /**
     * Tenta autenticar o usuário e senha.
     * Em caso de sucesso, retorna uma instância de UserSessionInterface.
     * Do contrário, lança uma exceção de tipo AuthException.
     * @param user Usuário da tentativa de login.
     * @param password Senha de 'user'.
     * @return Uma instância de UserSessionInterface se o usuário e senha corresponderem ao registro.
     * @throws AuthException Emitida quando a senha do usuário 'user' não corresponder a 'password'.
     */
    public UserSessionInterface tryAuth(UserInterface user, String password) throws AuthException {
        UserSession us = new UserSession(user, password);
        log(us);
        if (!us.isValid())
            throw new AuthException("Falha na autenticação! Login e/ou senha incorretos.");
        return us;
    }

    synchronized void log(UserSessionInterface session) {
        history.add(session);
    }

    public List<UserSessionInterface> getSessionsLogs() {
        return history;
    }
}