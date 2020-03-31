/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

import java.time.LocalDateTime;

/**
 * Representa uma sessão.
 * @author Victor Koehler
 */
public class UserSession implements UserSessionInterface {
    protected final UserInterface user;
    private final LocalDateTime time;
    private final boolean valid;
    private boolean expired;

    public UserSession(UserInterface user, String password) {
        this.time = LocalDateTime.now();
        this.user = user;
        this.valid = password.equals(user.getPassword());
        this.expired = !this.valid;
    }

    @Override
    public UserInterface getUser() {
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
