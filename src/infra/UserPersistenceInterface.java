package infra;

import java.util.Map;
import business.model.UserInterface;
import util.InfraException;

/**
 *
 * @author Luyza
 */
public interface UserPersistenceInterface {
    Map<String, UserInterface> loadUser() throws InfraException;

    void saveUsers(Map<String, UserInterface> users) throws InfraException;

}
