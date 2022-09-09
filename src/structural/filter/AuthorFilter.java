package structural.filter;

import java.util.List;
import java.util.stream.Collectors;

public class AuthorFilter implements CriteriaFilter{
    private Author author;
    public AuthorFilter(Author author){
        this.author = author;
    }
    @Override
    public List<Book> filterByCriteria(List<Book> books) {
        List<Book> books1 =  books.stream()
                .filter(book -> book.getAuthor().equals(this.author))
                .collect(Collectors.toList());
        return books1;
    }
}
