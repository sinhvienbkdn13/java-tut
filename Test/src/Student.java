import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private static int studentIdIncrement = 0;
    private int studentId;
    private String fullName;
    private String birthDay;
    private String classOf;
    private String major;
    private Loan loan;
    public Student(String fullName, String birthDay, String classOf, String major) {
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.classOf = classOf;
        this.major = major;
        setStudentId(studentIdIncrement++);
    }

    public void loanBook(Libary libary, Map<Book, Integer> bookLoans, String dateLoan, int numberOfBookLoan) {
        Map<LibaryBook, Integer> libaryBooksLoan = new HashMap<>();
        for(Map.Entry<Book, Integer> book : bookLoans.entrySet()) {
            LibaryBook libBook = libary.getLibBook(book.getKey());
            libaryBooksLoan.put(libBook, book.getValue());
        }

        // init new Loan cho Student
        loan = new Loan(dateLoan, numberOfBookLoan);
        loan.loanLibraryBook(libaryBooksLoan);

        // hien thi thong tin  muong sach
//        System.out.println("Nha sach muon" + libary.getAddress()
//                            "\n ") + ;
    }

    public void displayStudentInfo() {
        System.out.println("Ma sinh vien: " + this.studentId +
                            "\n Ten sinh vien: " + this.fullName
                            +"\n Ngay sinh: " + this.birthDay
                            +"\n Lop: " + this.classOf
                            +"\n Khoa: " + this.major);
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getClassOf() {
        return classOf;
    }

    public String getMajor() {
        return major;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public void setClassOf(String classOf) {
        this.classOf = classOf;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
