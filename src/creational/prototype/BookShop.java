package creational.prototype;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookShop implements IShop{

    private List<Book> books = null;
    public BookShop(){
        this.fetchData();
    }

    @Override
    public IShop makeCopy() {
        IShop shop = null;
        try {
            shop = (BookShop) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return shop;
    }

    @Override
    public void fetchData() {
        // The data fetch in the database will be stored in books list
        this.books = Arrays.asList(
                new Book("9781593279509", "Eloquent JavaScript, Third Edition", "Marijn Haverbeke" ),
                new Book("9781491943533", "Practical Modern JavaScript", "Nicolás Bevacqua"),
                new Book("9781593277574", "Understanding ECMAScript 6", "Nicholas C. Zakas"),
                new Book("9781449365035", "Speaking JavaScript", "Axel Rauschmayer"),
                new Book("9781449331818", "Learning JavaScript Design Patterns", "Addy Osmani")
        );
        System.out.println("Data fetched successfully");
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "books=" + books +
                '}';
    }
}
