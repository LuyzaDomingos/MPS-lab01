package util;

/**
 * Exceção usualmente lançada por business.control.UserAuth para denotar falhas na autenticação.
 */
public class AuthException extends BusinessValidationException {
    public AuthException() {
        this("Falha na autenticação! Login e/ou senha incorretos.");
    }

    public AuthException(String message) {
        super(message);
    }
}