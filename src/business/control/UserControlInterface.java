/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

import util.InfraException;
import util.InvalidLoginException;
import util.InvalidPasswordException;

/**
 * Gerencia os Usuários
 * 
 * @author Victor Koehler
 */
public interface UserControlInterface {
    void addUser(String login, String password) throws InvalidLoginException, InvalidPasswordException, InfraException;

    void deleteUser(String login) throws InfraException;

    business.model.UserInterface getUser(String login);

    boolean userExists(String login);
}
