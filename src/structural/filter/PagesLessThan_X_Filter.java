package structural.filter;

import java.util.List;
import java.util.stream.Collectors;

public class PagesLessThan_X_Filter implements CriteriaFilter{
    private int pagesLimit;
    public PagesLessThan_X_Filter(int pages){
        this.pagesLimit = pages;
    }
    @Override
    public List<Book> filterByCriteria(List<Book> books) {
        return books.stream()
                .filter(book -> book.getPages() < this.pagesLimit)
                .collect(Collectors.toList());
    }
}
