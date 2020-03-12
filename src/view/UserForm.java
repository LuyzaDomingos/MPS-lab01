package view;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class UserForm {

    public void menu(){
        	
        Scanner ler = new Scanner(System.in);
        int entrada;
        String user;
        String password;
        do{
            System.out.println("Olá!\n Digite o usuário: ");
            user = ler.next();
            System.out.println("Digite a senha: ");
            password = ler.next();
            System.out.println("Deseja repetir? (1-Sim | 0-Não)");
            entrada = ler.nextInt();
            if(entrada != 0){
                System.out.println("Entendido, Continuando...");
            }else{
                System.out.println("Entendido, Bye!");
            }
        }while(entrada!=0);
    }
}