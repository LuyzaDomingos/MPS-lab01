package view;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import business.control.UserControl;
import util.BusinessValidationException;
import util.InfraException;

/**
 * @author Leandro
 */
public class UserForm {

    public void menu(){
        try {
            UserControl a = new business.control.UserControl();
            
            Scanner ler = new Scanner(System.in);
            int entrada;
            String user;
            String password;
            do{
                System.out.println("Olá!\n Digite o usuário: ");
                user = ler.next();
                System.out.println("Digite a senha: ");
                password = ler.next();
                try {
                    a.addUser(user, password);
                }catch (BusinessValidationException | InfraException ex){
                    System.out.println(ex.getMessage());
                }
                System.out.println("Deseja repetir? ([1-9]-Sim | 0-Não)");
                try {
                    entrada = ler.nextInt();
                }catch(InputMismatchException ex){
                    entrada = 0;
                    System.out.println("Número inválido, encerrando o sistema.");
                }
                if(entrada != 0){
                    System.out.println("Entendido, Continuando...");
                }else{
                    System.out.println("Entendido, Bye!");
                }
            }while(entrada!=0);
        } catch (InfraException ex) {
                    System.out.println("Erro de abertura do sistema\n Contacte o"
                            + " serviço técnico\nAcionando o Circuit braker!");
                    System.out.println(ex.getMessage());
        }
    }
}