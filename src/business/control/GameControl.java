package business.control;

import infra.InfraException;
import util.InvalidLoginException;

/**
 * Gerencia os Usuários
 * 
 * @author leoPirpiri
 */
public class GameControl {

    public GameControl() throws InfraException {
        //
    }

    public void addGame(String login, String password) throws InvalidLoginException, InfraException {
        //Um objeto login para ser validado e os atributos do Game para ser adicionado.
    }

    public void deleteGame(String login, String GameTitulo) throws InfraException {
        //No caso precisa de um objeto login para validar e o Game a ser removido.
    }

}
