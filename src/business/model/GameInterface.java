package business.model;

import java.io.Serializable;
import java.util.Date;
/**
 * @author leoPirpiri
 */
public interface GameInterface extends Serializable{
    String getTitulo();

    float getPreco();
    
    Date getDataLancamento();

    void setPreco(float newPreco);
}
