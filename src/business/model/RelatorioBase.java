package business.model;

/**
 *
 * @author leoPirpiri
 */
public class RelatorioBase extends RelatorioGeral{
    private String conteudo;
    
    @Override
    public void gerarRelatorio(){
        System.out.println("Conteúdo Inicial, Relatório simplificado.");
    }
}
