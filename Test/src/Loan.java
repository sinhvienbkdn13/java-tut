import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Loan {
    private static int loanIdIncrement = 0;
    private int idLoan;
    private String dateLoan;
    private int numberLoan;
    List<LibaryBook> libBooks;

    public Loan(String dateLoan, int numberLoan) {
        this.dateLoan = dateLoan;
        this.numberLoan = numberLoan;
        setIdLoan(loanIdIncrement++);
    }

    public int getIdLoan() {
        return idLoan;
    }

    public void setIdLoan(int idLoan) {
        this.idLoan = idLoan;
    }

    public String getDateLoan() {
        return dateLoan;
    }

    public void setDateLoan(String dateLoan) {
        this.dateLoan = dateLoan;
    }

    public int getNumberLoan() {
        return numberLoan;
    }

    public void setNumberLoan(int numberLoan) {
        this.numberLoan = numberLoan;
    }

    public void loanLibraryBook(Map<LibaryBook, Integer> libBooks) {
        for(Map.Entry<LibaryBook, Integer> libaryBook : libBooks.entrySet()) {
            // set lai so luong cho tung loai sach trong lib book
            libaryBook.getKey().setSoluong(libaryBook.getValue());
        }
    }

    public void displayInfoLoan() {
        System.out.println("Ngay muon sach: " + dateLoan + "\n So luong sach muon: " + numberLoan);
    }
}
