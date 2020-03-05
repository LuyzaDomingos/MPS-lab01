/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra;
import java.util.Map;
import business.model.UserInterface;

/**
 *
 * @author aluno
 */
public interface UserPersistenceInterface {
    Map<String, UserInterface>loadUser();
    
    void saveUsers(Map<String, UserInterface> users);

    


    
}
