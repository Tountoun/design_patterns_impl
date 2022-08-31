package creational.prototype;

public class Book {
    // Here are some properties of a book
    private String title;
    private String authorName;
    private String isbn;

    public Book(String id, String title, String authorName){
        this.isbn = id;
        this.title = title;
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthorName() {
        return authorName;
    }
    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", id=" + isbn +
                '}';
    }

}
