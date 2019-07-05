import java.util.ArrayList;
import java.util.List;

public class Book {
    private String isbn;
    private String bookTitle;
    private String publisher;
    private String yearPublish;
    private double price;
    private Category category;
    private List<Author> authors;

    public Book(String isbn, String bookTitle, String publisher, String yearPublish, double price) {
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.publisher = publisher;
        this.yearPublish = yearPublish;
        this.price = price;
        authors = new ArrayList<Author>();
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public List<Author> getListAuthor() {
        return this.authors;
    }

    public Book getBook() {
        return new Book(this.isbn, this.bookTitle, this.publisher, this.yearPublish, this.price);
    }

    public String getIsbn() {
        return isbn;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getYearPublish() {
        return yearPublish;
    }

    public double getPrice() {
        return price;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYearPublish(String yearPublish) {
        this.yearPublish = yearPublish;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayBookInfo() {
        System.out.println("Ma Sach: " + isbn + "\n Ten Sach: " + bookTitle
                + "\n Nha Xuat Ban: " + publisher
                + "\n Nam Xuat Ban: " + yearPublish
                + "\n Gia Sach: " + price);
    }
}
