package business.model;

/**
 *
 * @author leoPirpiri
 */
public class Relatorio {
    private RelatorioGeral geral;
    
    public Relatorio (String conteudo){
        geral = new RelatorioBase(conteudo);
    }
    
    public String gerarRelatorioSimples(){
        return geral.gerarRelatorio();
    }
    public String gerarRelatorioCompletoUser(){
        var a = new RelatorioUser(geral);
        return a.gerarRelatorio();
    }
    public String gerarRelatorioCompletoNews(){
        var a = new RelatorioNews(geral);
        return a.gerarRelatorio();
    }
    public String gerarRelatorioFull(){
        var a = new RelatorioUser(geral);
        var b = new RelatorioNews(a);
        return b.gerarRelatorio();
    }
}
