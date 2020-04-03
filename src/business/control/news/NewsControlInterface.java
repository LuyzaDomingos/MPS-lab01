package business.control.news;

import java.time.LocalDateTime;
import java.util.Set;

import business.model.NewsInterface;
import business.model.UserInterface;

public interface NewsControlInterface {
    /**
     * Obtém a notícia pelo seu ID.
     * @param index ID
     * @return Notícia
     */
    NewsInterface getNews(int index);

    /**
     * Cadastra uma nova notícia.
     * @return O ID da notícia.
     */
    int addNews(NewsInterface item);

    /**
     * Remove uma notícia.
     */
    void removeNews(NewsInterface item);

    /**
     * Remove uma notícia.
     */
    void removeNews(int id);

    /**
     * Obtém todas as notícias cadastradas.
     */
    Iterable<NewsInterface> getAllNews();

    /**
     * Obtém todas as notícias de um determinado autor.
     * @param author Autor
     * @return Conjunto de notícias
     */
    Iterable<NewsInterface> getAllNewsFromAuthor(UserInterface author);

    /**
     * Obtém todas as notícias de uma determinada categoria.
     * @param category Categoria
     * @return Conjunto de notícias
     */
    Iterable<NewsInterface> getAllNewsOfCategory(String category);

    /**
     * Obtém todas as notícias atualizadas em um determinado período de tempo específicado.
     * Se a notícia nunca foi atualizada, se aplica a data e hora em que ela foi postada.
     * @param start Inicío do período
     * @param end Fim do período
     * @return Conjunto de notícias
     */
    Iterable<NewsInterface> getAllNewsFromDateTimeRange(LocalDateTime start, LocalDateTime end);
}