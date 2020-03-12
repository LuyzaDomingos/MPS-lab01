package infra;

import java.util.Map;
import business.model.UserInterface;

/**
 *
 * @author Luyza
 */
public interface UserPersistenceInterface {
    Map<String, UserInterface> loadUser() throws infra.InfraException;

    void saveUsers(Map<String, UserInterface> users) throws infra.InfraException;

}
