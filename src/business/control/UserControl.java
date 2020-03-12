/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

import java.util.Map;
import business.model.User;
import business.model.UserInterface;
import infra.InfraException;
import infra.UserPersistence;
import infra.UserPersistenceInterface;
import util.InvalidLoginException;
import util.InvalidPasswordException;

/**
 * Gerencia os Usuários
 * 
 * @author Victor Koehler
 */
public class UserControl implements UserControlInterface {
    private Map<String, UserInterface> users;
    private final UserPersistenceInterface persistence;

    public UserControl() throws InfraException {
        this.persistence = UserPersistence.getInstance();
        this.users = persistence.loadUser();
    }

    public void addUser(String login, String password)
            throws InvalidLoginException, InvalidPasswordException, InfraException {
        UserInputValidator.validateLogin(login);
        UserInputValidator.validatePassword(password);
        User u = new User(login, password);
        users.put(login, u);
        persistence.saveUsers(users);
    }

    public void deleteUser(String login) throws InfraException {
        users.remove(login);
        persistence.saveUsers(users);
    }

    public business.model.UserInterface getUser(String login) {
        return users.get(login);
    }
}
