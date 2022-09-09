package structural.filter;

import java.util.List;
import java.util.stream.Collectors;

public class PagesRange_X_Y_Filter implements CriteriaFilter{
    private int startPage;
    private int endPage;

    public PagesRange_X_Y_Filter(int startPage, int endPage){
        this.startPage = startPage;
        this.endPage = endPage;
    }

    @Override
    public List<Book> filterByCriteria(List<Book> books) {
        return books.stream()
                .filter(book -> book.getPages() >= startPage && book.getPages() <= endPage)
                .collect(Collectors.toList());
    }

}
