package business.model;

import java.util.Set;
import java.io.Serializable;
import java.time.LocalDateTime;

public interface NewsInterface extends Serializable {
    /**
     * Autores
     */
    Set<UserInterface> getAuthors();

    /**
     * Categorias da notícia
     */
    Set<String> getCategories();

    /**
     * Conteúdo da notícia
     */
    String getContent();

    /**
     * Data da primeira postagem.
     */
    LocalDateTime getPostedTime();

    /**
     * Data da última atualização/versão.
     */
    LocalDateTime getUpdatedTime();
}