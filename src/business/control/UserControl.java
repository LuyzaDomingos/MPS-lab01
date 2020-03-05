/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

import java.util.Map;
import java.util.HashMap;
import business.model.User;
import business.model.UserInterface;

/**
 * Gerencia os Usuários
 * @author Victor Koehler
 */
public class UserControl implements UserControlInterface {
    private Map<String, UserInterface> users;

    public UserControl() {
        this.users = new HashMap<>();
    }

    public void addUser(String login, String password) {
        User u = new User(login, password);
        users.put(login, u);
    }

    public void deleteUser(String login) {
        users.remove(login);
    }

    public business.model.UserInterface getUser(String login) {
        return users.get(login);
    }
}
