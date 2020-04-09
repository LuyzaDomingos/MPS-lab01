package view;

import business.model.Relatorio;
import util.InfraException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leoPirpiri
 */
public class Main {
    public static void main(String[] args) {
//        Relatorio rl = new Relatorio();
//        rl.gerarRelatorioFull();
        UserForm formulario = new UserForm();
        formulario.menu();
    }
}

/*
A diferença entre strategy e state
saber a diferença entree um e outo strategy
        */