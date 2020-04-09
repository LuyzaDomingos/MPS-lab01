package business.model;

/**
 *
 * @author leoPirpiri
 */
public class RelatorioUser extends DecoracaoParte{
    private RelatorioGeral relatorio;
    
    public RelatorioUser(RelatorioGeral relatorio){
        this.relatorio = relatorio;
    }
    
    @Override
    public String gerarRelatorio(){
        return relatorio.gerarRelatorio() + "\nConteúdo adicional de relatório de User";
    }
}
