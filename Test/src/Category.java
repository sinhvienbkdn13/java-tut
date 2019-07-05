import java.util.ArrayList;
import java.util.List;

public class Category {
    private static int catIdIncrement = 0;
    private int catId;
    private String catName;
    private String description;
    private List<Book> books;

    Category(String catName, String description) {
        this.catName = catName;
        this.description = description;
        setCatId(catIdIncrement++);
        this.books = new ArrayList<>();
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getListBook() {
        return this.books;
    }

    public void displayCategoryInfo() {
        System.out.println("Ma chuyen muc: " + catId + " \n Chuyen muc: " + catName + " ( " + description + " )");
    }
}
