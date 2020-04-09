package infra;

/**
 *
 * @author leoPirpiri
 */
public class Factory {
    public Persistence getInstance (String tipo){
        if (tipo.equals("User")){
            return new UserPersistence();
        }else if(tipo.equals("Game")){
            return new GamePersistence();
        }else if(tipo.equals("News")){
            return new NewsPersistence();
        }
        return null;
    }
}
