package infra;

import java.util.ArrayList;
import java.util.List;
import business.model.UserSessionInterface;

/**
 * Registra eventos relacionados a autenticação.
 * 
 * @author Victor Koehler
 */

public class AuthLogger {

    private final List<UserSessionInterface> history;

    /**
     * Singleton
     */
    private static AuthLogger instance;

    protected AuthLogger() {
        history = new ArrayList<>();
    }

    /**
     * @return Singleton
     */
    public static synchronized AuthLogger getInstance() {
        if (instance == null) {
            instance = new AuthLogger();
        }
        return instance;
    }

    public synchronized void log(UserSessionInterface session) {
        history.add(session);
    }

    public List<UserSessionInterface> getLog() {
        return history;
    }
}