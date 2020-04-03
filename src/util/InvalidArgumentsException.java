package util;

/**
 * Exceção dedicada a especificação inválida em números ou tipos de argumentos.
 * Util para classes que implementam Command.
 */
public class InvalidArgumentsException extends RuntimeException {
    /**
     * Construtor padrão para a exceção.
     * Mensagem: "Argumentos inválidos para a operação solicitada."
     */
    public InvalidArgumentsException() {
        this("Argumentos inválidos para a operação solicitada.");
    }

    /**
     * Construtor padrão para mensagem personalizadas.
     * @param message Mensagem da exceção
     */
    public InvalidArgumentsException(String message) {
        super(message);
    }

    /**
     * Contrutor auxiliar para especificar a quantidade de parâmetros esperados/obtidos.
     * Não faz a verificação de igualdade por conta própria.
     * @param expected Número de parâmetros esperados
     * @param real Número de parâmetros fornecidos
     */
    public InvalidArgumentsException(int expected, int real) {
        super(String.format("%d argumentos esperados. %d fornecidos.", expected, real));
    }
}