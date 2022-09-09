package structural.filter;

import java.util.List;
import java.util.stream.Collectors;

public class PagesMoreThan_X_Filter implements  CriteriaFilter{
    private int startNumberOfPages;
    public PagesMoreThan_X_Filter(int pages){
        this.startNumberOfPages = pages;
    }

    @Override
    public List<Book> filterByCriteria(List<Book> books) {
        return books.stream()
                .filter(book -> book.getPages() > this.startNumberOfPages)
                .collect(Collectors.toList());
    }
}
