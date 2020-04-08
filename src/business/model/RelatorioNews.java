package business.model;

/**
 *
 * @author leoPirpiri
 */
public class RelatorioNews extends DecoracaoParte{
    private RelatorioGeral relatorio;
    
    public RelatorioNews(RelatorioGeral relatorio){
        this.relatorio = relatorio;
    }
    
    @Override
    public void gerarRelatorio(){
        relatorio.gerarRelatorio();
        System.out.println("conteúdo adicional de relatório de News");
    }
}
