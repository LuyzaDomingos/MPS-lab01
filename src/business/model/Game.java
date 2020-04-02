package business.model;
import java.util.Date;
/**
 * Representação de um jogo que está sendo ofertado.
 * @author leoPirpiri
 */
public class Game implements GameInterface{
    private String titulo;
    private float preco;
    private Date dataLancamento;

    public Game(String titulo, float preco, Date dataLancamento) {
        this.titulo = titulo;
        this.preco = preco;
        this.dataLancamento = dataLancamento;
    }
    @Override
    public String getTitulo() {
        return titulo;
    }
    @Override
    public float getPreco() {
        return preco;
    }
    @Override
    public Date getDataLancamento() {
        return dataLancamento;
    }
    @Override
    public void setPreco(float preco) {
        this.preco = preco;
    }
}
