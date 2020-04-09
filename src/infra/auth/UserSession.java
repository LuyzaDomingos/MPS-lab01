/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra.auth;

import java.time.LocalDateTime;

import business.control.ControlFacade;
import business.model.UserInterface;

/**
 * Representa uma sessão.
 * @author Victor Koehler
 */
public class UserSession implements UserSessionInterface {
    protected final String user;
    private final LocalDateTime time;
    private final boolean valid;
    private boolean expired;

    UserSession(String user, String password) {
        this.time = LocalDateTime.now();
        this.user = user;
        if (ControlFacade.getInstanceOrDie().userExists(user)) {
            this.valid = password.equals(ControlFacade.getInstanceOrDie().getUser(user).getPassword());
        } else {
            this.valid = false;
        }
        this.expired = !this.valid;
    }

    @Override
    public UserInterface getUser() {
        return ControlFacade.getInstanceOrDie().getUser(user);
    }

    @Override
    public String getUserLogin() {
        return user;
    }

    @Override
    public boolean isValid() {
        return isAuthenticated() && !isExpired();
    }

    @Override
    public void disconnect() {
        expired = false;
    }
    
    @Override
    public LocalDateTime getEventTime() {
        return time;
    }

    @Override
    public boolean isAuthenticated() {
        return valid;
    }

    @Override
    public boolean isExpired() {
        return expired; // TODO: Logic
    }
}
