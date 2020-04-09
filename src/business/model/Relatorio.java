package business.model;

/**
 *
 * @author leoPirpiri
 */
public class Relatorio {
    private RelatorioGeral geral;
    
    public Relatorio (){
        geral = new RelatorioBase();
    }
    
    public void gerarRelatorioSimples(){
        geral.gerarRelatorio();
    }
    public void gerarRelatorioCompletoUser(){
        geral = new RelatorioUser(geral);
        geral.gerarRelatorio();
    }
    public void gerarRelatorioCompletoNews(){
        geral = new RelatorioNews(geral);
        geral.gerarRelatorio();
    }
    public void gerarRelatorioFull(){
        geral = new RelatorioUser(geral);
        geral = new RelatorioNews(geral);
        geral.gerarRelatorio();
    }
}
