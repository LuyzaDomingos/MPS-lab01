package business.control;

import util.InvalidLoginException;
import util.InvalidPasswordException;

/**
 * Gerencia os Usuários
 * @author Victor Koehler
 */
public final class UserInputValidator {
    public static void validateLogin(String login) throws InvalidLoginException {
        if (login == null) throw new InvalidLoginException("Login não pode ser null");
        else if (login.isEmpty()) throw new InvalidLoginException("Login não pode ser vazio");
        else if (login.length() > 20) throw new InvalidLoginException("Login deve possuir no máximo 20 caracteres");
        else if (login.matches(".*\\d*.*")) throw new InvalidLoginException("Login não pode possuir números");
    }

    public static void validatePassword(String password) throws InvalidPasswordException {
        if (password == null) throw new InvalidPasswordException("Password não pode ser null");
        else if (password.length() < 8) throw new InvalidPasswordException("Password deve possuir no mínimo 8 caracteres");
        else if (password.length() > 12) throw new InvalidPasswordException("Password deve possuir no máximo 12 caracteres");
        else if (!password.matches(".*[a-zA-Z]*.*") || !password.matches(".*\\d.*\\d.*"))
            throw new InvalidPasswordException("Password deve possuir letras e no mínimo 2 números.");
    }
}