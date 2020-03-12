package business.control;

import util.InvalidPasswordException;

/**
 * Strategy para validar Senhas
 * @author Victor Koehler
 */
public class PasswordInputValidator implements InputValidator {
    public void validate(String password) throws InvalidPasswordException {
        if (password == null) throw new InvalidPasswordException("Password não pode ser null");
        else if (password.length() < 8) throw new InvalidPasswordException("Password deve possuir no mínimo 8 caracteres");
        else if (password.length() > 12) throw new InvalidPasswordException("Password deve possuir no máximo 12 caracteres");
        else if (!password.matches(".*[a-zA-Z]*.*") || !password.matches(".*\\d.*\\d.*"))
            throw new InvalidPasswordException("Password deve possuir letras e no mínimo 2 números.");
    }
}