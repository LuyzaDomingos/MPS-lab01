package infra;

/**
 *
 * @author Luyza
 */
public class InfraException extends Exception {

    public InfraException(String message) {
        super(message);
    }

    public InfraException(){
        super("Erro na aplicação. Procure pelo o.....");
    }
}
