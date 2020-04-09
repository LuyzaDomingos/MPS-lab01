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
    public String gerarRelatorio(){
        return relatorio.gerarRelatorio() + "\nConteúdo adicional de relatório de News";
    }
}
