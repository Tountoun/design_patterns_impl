package structural.filter;

public class Book {
    private String uuid;
    private Author author;
    private String title;
    private String date;
    private String link;
    private int pages;
    private Language language;

    public Book(Author author, String uuid, String title, String year, String link, int pages, Language language){
        this(author, uuid, title, link, pages);
        this.language = language;
        this.date = year;
    }
    public Book(Author author, String uuid, String title, String link, int pages){
        this(author, uuid);
        this.title = title;
        this.link = link;
        this.pages = pages;
    }
    public Book(Author author, String uuid){
        this.author = author;
        this.uuid = uuid;
        this.title = "Unknown";
    }
    // Getters
    public String getUuid() {
        return uuid;
    }
    public Author getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public String getDate() {
        return date;
    }
    public String getLink() {
        return link;
    }
    public int getPages() {
        return pages;
    }
    public Language getLanguage() {
        return language;
    }
    // Setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Book{" +
                "uuid='" + uuid + '\'' +
                ", author=" + author +
                ", title='" + title + '\'' +
                ", date=" + date +
                ", link='" + link + '\'' +
                ", pages=" + pages +
                ", language=" + language +
                '}';
    }
}
