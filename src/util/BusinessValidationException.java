package util;

/**
 * Exceção usualmente lançada por business.control.UserControl para denotar logins inválidos.
 */
public class BusinessValidationException extends Exception {
    public BusinessValidationException() {
        this("Login inválido, possivelmente o usuário não existe.");
    }

    public BusinessValidationException(String message) {
        super(message);
    }
}