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


/**
 *
 * @author Luyza
 */

public class UserPersistence implements UserPersistenceInterface,Serializable{

   
    private static FileInputStream readUser;
    private static FileOutputStream writeUser;
    
    private static ObjectInputStream readObj;
    private static ObjectOutputStream writeObj;
    
    private File file;

    public UserPersistence(String name) {
        file = new File(name);
    }

    @Override
    public Map<String, UserInterface> loadUser() throws InfraException {
        try{
            readUser = new FileInputStream(file);
            readObj = new ObjectInputStream(readUser);
            Map<String, UserInterface> users = (HashMap) readObj.readObject(); 
            readUser.close();
            readObj.close();
            return users;
            
        }catch(IOException ex){
            throw new InfraException("Não foi possível carregar o usuário!");
        }
    }

    @Override
    public void saveUsers(Map<String, UserInterface> users) throws InfraException {

        try{
        
            writeUser = new FileOutputStream(file);
            writeObj = ObjectOutputStream(writeUser); //##
            writeObj.writeObject(users);
            writeUser.close();
            writeObj.close();
            
        }catch(IOException ex){
            throw new InfraException("Não foi possível salvar o cadastro!");
        }
    }

   

}