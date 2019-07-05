import java.util.BitSet;
import java.util.List;

public class LibaryBook extends Book {
    private static int libIdIncrement = 0;
    private int libBookId;
    private String bookPosition;
    private String datePutOn;
    private int numberOfBook;
    private Libary libary;

    public LibaryBook (Book book, String bookPosition, String datePutOn, int numberOfBook) {
        super(book.getIsbn(), book.getBookTitle(), book.getPublisher(), book.getYearPublish(), book.getPrice());
        this.bookPosition = bookPosition;
        this.datePutOn = datePutOn;
        this.numberOfBook = numberOfBook;
        setLibBookId(libIdIncrement++);
    }

    public int getLibBookId() {
        return libBookId;
    }

    public void setLibBookId(int libBookId) {
        this.libBookId = libBookId;
    }

    public String getBookPosition() {
        return bookPosition;
    }

    public void setBookPosition(String bookPosition) {
        this.bookPosition = bookPosition;
    }

    public String getDatePutOn() {
        return datePutOn;
    }

    public void setDatePutOn(String datePutOn) {
        this.datePutOn = datePutOn;
    }

    public int getNumberOfBook() {
        return numberOfBook;
    }

    public void setNumberOfBook(int numberOfBook) {
        this.numberOfBook = numberOfBook;
    }

    public Libary getLibary() {
        return libary;
    }

    public void setLibary(Libary libary) {
        this.libary = libary;
    }

    public void displayInfoLibaryBook() {
        System.out.println("Ma Sach: " + super.getIsbn()
                            + "\n Tieu De Sach: " + super.getBookTitle()
                            + "\n Nha Xuat Ban: " + super.getPublisher()
                            + "\n Nam Xuat Ban: " + super.getYearPublish()
                            + "\n Gia Sach: " + super.getPrice()
                            + "\n Vi Tri Sach: " + this.bookPosition
                            + "\n Ngay Dua Sach Vao Thu Vien: " + this.datePutOn
                            + "\n So Luong Sach: " + this.numberOfBook);
    }

    public int getSoLuong() {
        return this.numberOfBook;
    }

    public void setSoluong(int numberOfBookLoan) {

        this.numberOfBook = this.numberOfBook - numberOfBookLoan;
    }
}
