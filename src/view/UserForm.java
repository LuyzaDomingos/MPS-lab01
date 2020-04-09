package view;

import business.control.ControlFacade;
import infra.InfraException;
import java.util.InputMismatchException;
import java.util.Scanner;
import util.BusinessValidationException;

/**
 * @author LeoPirpiri
 */
public class UserForm {
    
    Scanner ler = new Scanner(System.in);

    private void printOpcion(){
        System.out.println("Olá!\nO que deseja fazer?\n"
                         + "#------------+++++------------#\n"
                         + "# 1-Cadastrar Usuário.        #\n"
                         + "# 2-Logar no sistema.         #\n"
                         + "# 3-Excluir Usuário.          #\n"
                         + "# 0-Sair do sistema.          #\n"
                         + "#------------+++++------------#");
    }
    private String lerUsuario(){
        System.out.print("Informe o nome do usuário: ");
        String user = ler.next();  
        return user;
    }
    private String lerSenha(){
        System.out.print("Digite a senha: ");
        String password = ler.next();  
        return password;
    }
    public void menu(){
        try {
            ControlFacade a = new ControlFacade();
            int opcao;
            String user;
            String password;
            do{
                this.printOpcion();
                try {
                    opcao = ler.nextInt();
                }catch(InputMismatchException ex){
                    opcao = -1;
                }
                switch(opcao){
                    case 0:
                        System.out.println("Ok! Entendido... Encerrando o sistema\nAté breve!");
                        break;
                    case 1:
                        user = lerUsuario();
                        password = lerSenha();
                        try {
                            a.addUser(user, password);
                            System.out.println("Usuário: "+user+" cadastrado com sucesso");
                        }catch (BusinessValidationException | InfraException ex){
                            System.out.println(ex.getMessage());
                        }
                        break;
                    case 2:
                        user = lerUsuario();
                        password = lerSenha();
                       try {
                           a.authUser(user, password);
                           System.out.println("Usuário autenticado com sucesso");
                       }catch (BusinessValidationException ex){
                           System.out.println(ex.getMessage());
                       }
                        break;
                    case 3:
                        user = lerUsuario();
                        a.deleteUser(user);
                        System.out.println("Usuário: "+user+" excluído com sucesso");
                        break;
                    default:
                        System.out.println("Opção inválida, encerrando o sistema.");
                        break;
                }
            }while(opcao!=0);
        } catch (InfraException ex) {
                    System.out.println("Erro de abertura do sistema\n Contacte o"
                            + " serviço técnico\nAcionando o Circuit braker!");
                    System.out.println(ex.getMessage());
        }
    }
}