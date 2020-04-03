package util;

/**
 * Exceção dedicada a especificação de comandos inválidos.
 */
public class InvalidCommandException extends RuntimeException {
    /**
     * Construtor padrão para a exceção.
     * Mensagem: "Comando inválido."
     */
    public InvalidCommandException() {
        this("Comando inválido.");
    }

    /**
     * Construtor padrão para mensagem personalizadas.
     * @param message Mensagem da exceção
     */
    public InvalidCommandException(String message) {
        super(message);
    }
}