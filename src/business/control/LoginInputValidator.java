package business.control;

import util.InvalidLoginException;

/**
 * Strategy para validar Logins
 * @author Victor Koehler
 */
public class LoginInputValidator implements InputValidator {
    public void validate(String login) throws InvalidLoginException {
        if (login == null) throw new InvalidLoginException("Login não pode ser null");
        else if (login.isEmpty()) throw new InvalidLoginException("Login não pode ser vazio");
        else if (login.length() > 20) throw new InvalidLoginException("Login deve possuir no máximo 20 caracteres");
        else if (login.matches(".*\\d+.*")) throw new InvalidLoginException("Login não pode possuir números");
    }
}