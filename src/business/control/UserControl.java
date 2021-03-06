/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

import java.util.Map;
import business.model.User;
import business.model.UserInterface;
import infra.UserPersistence;
import infra.UserPersistenceInterface;
import infra.auth.LoginInputValidator;
import infra.auth.PasswordInputValidator;
import util.InvalidLoginException;
import util.InvalidPasswordException;
import util.InfraException;

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

    @Override
    public void addUser(String login, String password) throws InvalidLoginException, InvalidPasswordException, InfraException {
        new LoginInputValidator().validate(login);
        new PasswordInputValidator().validate(password);
        if (userExists(login)) {
            throw new InvalidLoginException("Já existe um usuário com esse login.");
        }
        User u = new User(login, password);
        users.put(login, u);
        persistence.saveUsers(users);
    }

    @Override
    public void deleteUser(String login) throws InfraException {
        users.remove(login);
        persistence.saveUsers(users);
    }

    @Override
    public business.model.UserInterface getUser(String login) {
        return users.get(login);
    }

    @Override
    public boolean userExists(String login) {
        return getUser(login) != null;
    }
}
