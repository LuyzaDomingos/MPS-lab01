package infra;

import business.model.*;
import java.io.*;
import java.util.*;
import util.InfraException;

public class UserPersistence implements UserPersistenceInterface, Serializable {

    private static FileOutputStream writeUser;
    private static FileInputStream readUser;
    private static ObjectInputStream readObj;
    private static ObjectOutputStream writeObj;

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
        }catch(){

        }catch(){

        }
    }

    @Override
    public void saveUsers(Map<String, UserInterface> users) throws InfraException {

        try{
        
            writeUser = new FileInputStream(file);
            writeObj = ObjectOutputStream(writeUser);
            writeObj.writeObject(users);
            writeUser.close();
            writeObj.close();
        }catch(){

        }catch(){

        }
    }

}