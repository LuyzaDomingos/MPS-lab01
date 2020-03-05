package util;

/**
 * Exceção usualmente lançada por business.control.UserControl para denotar logins inválidos.
 */
public class InvalidLoginException extends Exception {
    public InvalidLoginException() {
        this("Login inválido, possivelmente o usuário não existe.");
    }

    public InvalidLoginException(String message) {
        super(message);
    }
}