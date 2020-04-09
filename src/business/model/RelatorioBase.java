package business.model;

/**
 *
 * @author leoPirpiri
 */
public class RelatorioBase extends RelatorioGeral{
    private String conteudo;
    
    public RelatorioBase(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String gerarRelatorio(){
        return conteudo;
    }
}
