package util;

/**
 * 
 */
public class ExternalServiceException extends InfraException {
    public ExternalServiceException(){
        super("Erro ao acessar um serviço externo a aplicação.");
    }

    public ExternalServiceException(String message) {
        super(message);
    }

    public ExternalServiceException(String message, Throwable b) {
        super(message, b);
    }

}