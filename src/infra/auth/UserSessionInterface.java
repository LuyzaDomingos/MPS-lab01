package infra.auth;

import java.time.LocalDateTime;
import business.model.UserInterface;

/**
 * Representa uma instância de Login
 * 
 * @author Victor Koehler
 */
public interface UserSessionInterface {

    /**
     * Obtém o usuário da sessão.
     * Pode retornar null caso a sessão não seja válida.
     */
    UserInterface getUser();

    /**
     * O Login do usuário correspondente.
     */
    String getUserLogin();

    /**
     * Se a sessão ainda é válida.
     * Isto é, se não foi desconectada, expirada ou a autenticação falhou.
     * Encapsula isAuthenticated e isExpired.
     */
    boolean isValid();

    /**
     * Desconecta imediatamente a sessão.
     */
    void disconnect();

    /**
     * A data e hora da ocorrência da autenticação.
     */
    LocalDateTime getEventTime();

    /**
     * Se o usuário foi autenticado (usuário e senhas corretos).
     */
    boolean isAuthenticated();

    /**
     * Se o tempo da sessão expirou.
     */
    boolean isExpired();
}
