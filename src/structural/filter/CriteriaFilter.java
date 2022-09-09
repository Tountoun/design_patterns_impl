package structural.filter;

import java.util.List;

public interface CriteriaFilter {
    public List<Book> filterByCriteria(List<Book> books);
}
