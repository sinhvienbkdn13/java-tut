import java.util.ArrayList;
import java.util.List;

public class Libary {
    private static int libIdIncrement = 0;
    private int libId;
    private String address;
    private List<LibaryBook> libaryBooks;

    public Libary(String address) {
        this.address = address;
        setLibId(libIdIncrement++);
        libaryBooks = new ArrayList<>();
    }

    public int getLibId() {
        return libId;
    }

    public void setLibId(int libId) {
        this.libId = libId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LibaryBook getLibBook(Book book) {
        LibaryBook libaryBook= null;
        for(LibaryBook libook : libaryBooks ) {
            // so sanh ma ISBN
            if(libook.getBook().getIsbn().equals(book.getIsbn())) {
                libaryBook = libook;
                break;
            }
        }
        return libaryBook;
    }

    public void addLibBook(LibaryBook libBook) {
        this.libaryBooks.add(libBook);
    }

    public List<LibaryBook> getLibBook(){
        return this.libaryBooks;
    }

    public void displayInfoLibary(){
        System.out.println("Dia chi thu vien: " + this.address);
    }
}
