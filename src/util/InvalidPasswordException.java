package util;

/**
 * Exceção usualmente lançada por business.control.UserControl para denotar senhas inválidas.
 */
public class InvalidPasswordException extends BusinessValidationException {
    public InvalidPasswordException() {
        this("Senha inválida.");
    }

    public InvalidPasswordException(String message) {
        super(message);
    }
}