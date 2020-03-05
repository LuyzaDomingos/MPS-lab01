/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

/**
 * Representa Usuários
 * @author Victor Koehler
 */
public interface UserInterface {
    String getLogin();

    String getPassword();

    void setPassword(String newPassword);
}
