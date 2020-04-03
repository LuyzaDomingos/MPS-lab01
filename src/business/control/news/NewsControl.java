package business.control.news;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import business.model.NewsInterface;
import business.model.UserInterface;

/**
 * Esta implementação de NewsControlInterface não leva em consideração
 * implicações e boas práticas de obtenção de itens de Banco de Dados.
 * 
 * Ao invés disso, ela controla e armazena por conta própria os objetos.
 */
public class NewsControl implements NewsControlInterface {
    private List<NewsInterface> news;

    public NewsControl() {
        this.news = new ArrayList<>();
    }

    /**
     * Obtém a notícia pelo seu indíce.
     * 
     * @param index Indíce relativo a getAllNews().
     * @return Notícia
     */
    @Override
    public NewsInterface getNews(int index) {
        return news.get(index);
    }

    @Override
    public int addNews(NewsInterface item) {
        news.add(item);
        return news.size()-1;
    }

    @Override
    public void removeNews(NewsInterface item) {
        news.remove(item);
    }

    @Override
    public void removeNews(int id) {
        news.remove(id);

    }


    @Override
    public Iterable<NewsInterface> getAllNews() {
        return news;
    }

    @Override
    public Iterable<NewsInterface> getAllNewsFromAuthor(UserInterface author) {
        return news.stream().filter((i) -> i.getAuthors().contains(author)).collect(Collectors.toList());
    }

    @Override
    public Iterable<NewsInterface> getAllNewsOfCategory(String category) {
        return news.stream().filter((i) -> i.getCategories().contains(category)).collect(Collectors.toList());
    }

    @Override
    public Iterable<NewsInterface> getAllNewsFromDateTimeRange(LocalDateTime start, LocalDateTime end) {
        return news.stream()
                .filter((i) -> i.getUpdatedTime().isAfter(start) && i.getUpdatedTime().isBefore(end))
                .collect(Collectors.toList());
    }
}