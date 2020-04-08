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
    public void gerarRelatorio(){
        relatorio.gerarRelatorio();
        System.out.println("conteúdo adicional de relatório de User");
    }
}
