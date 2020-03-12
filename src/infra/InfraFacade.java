package infra;

import business.model.UserInterface;
import java.util.Map;
import infra.InfraException;

/**
 *Implementação do Padrão de Projeto Facade
 * @author Luyza
 */

public class InfraFacade {
    
    public Map<String, UserInterface> loadUser() throws InfraException{
        return UserPersistence.getInstance().loadUser();
    }
    
    public void saveUsers(Map<String, UserInterface> users) throws InfraException{
        UserPersistence.getInstance().saveUsers(users);
    }
    
    
}
