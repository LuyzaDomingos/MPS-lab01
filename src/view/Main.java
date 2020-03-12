/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import infra.InfraException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String[] args) {
        try {
            var a = new business.control.UserControl();
        } catch (InfraException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        UserForm formulario = new UserForm();
        formulario.menu();
    }
}

/*
A diferença entre strategy e state
saber a diferença entree um e outo strategy
        */