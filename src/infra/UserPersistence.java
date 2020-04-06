package infra;

import business.model.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.io.Serializable;
import util.InfraException;

/**
 *
 * @author Luyza
 */

public class UserPersistence implements UserPersistenceInterface, Serializable {

    private FileInputStream readUser;
    private FileOutputStream writeUser;

    private  ObjectInputStream readObj;
    private  ObjectOutputStream writeObj;

    private File file;

    /**
     * Singleton
     */
    private static UserPersistence instance = new UserPersistence();

    /*
     * public UserPersistence(String name) { file = new File(name); }
     */
    protected UserPersistence() {
        file = new File("file.txt");
    }

    /**
     * Singleton
     * 
     * @return
     */
    public static synchronized UserPersistence getInstance() {
        return instance;
    }

    @Override
    public Map<String, UserInterface> loadUser() throws InfraException {
        if(!file.exists()){
            return new HashMap<>();
        }
        
        try {
            readUser = new FileInputStream(file);
            readObj = new ObjectInputStream(readUser);
            Map<String, UserInterface> users = (HashMap<String,UserInterface>) readObj.readObject();
            readUser.close();
            readObj.close();
            return users;

        } catch (IOException | ClassNotFoundException  ex) {
            throw new InfraException("Não foi possível carregar os dados do usuári devido "+ ex.getMessage());
        }
    }

    @Override
    public void saveUsers(Map<String, UserInterface> users) throws InfraException {
        try {
            writeUser = new FileOutputStream(file);
            writeObj = new ObjectOutputStream(writeUser);
            writeObj.writeObject(users);
            writeUser.close();
            writeObj.close();

        } catch (IOException ex) {
            throw new InfraException("Não foi possível salvar o cadastro do usuário devido" + ex.getMessage());
        }
    }

}