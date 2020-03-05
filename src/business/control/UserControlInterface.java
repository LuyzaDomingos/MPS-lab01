/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

/**
 * Gerencia os Usuários
 * @author Victor Koehler
 */
public interface UserControlInterface {
    void addUser(String login, String senha);

    void deleteUser(String login);

    business.model.UserInterface getUser(String login);
}
