package structural.filter;

import java.util.List;
import java.util.stream.Collectors;

public class LanguageFilter implements CriteriaFilter{
    private Language language;
    public LanguageFilter(Language language){
        this.language = language;
    }
    @Override
    public List<Book> filterByCriteria(List<Book> books){
        return books.stream()
                .filter(book -> book.getLanguage().name().equals(this.language.name()))
                .collect(Collectors.toList());
    }
}
