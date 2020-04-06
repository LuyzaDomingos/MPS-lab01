package util;

/**
 *
 * @author Luyza
 */
public class InfraException extends Exception {

    public InfraException(String message) {
        super(message);
    }

    public InfraException(){
        super("Erro na aplicação.");
    }

    public InfraException(String message, Throwable b) {
        super(message, b);
    }
}
