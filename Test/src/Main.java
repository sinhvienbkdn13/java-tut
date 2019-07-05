import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static List<Category> categories;
    private static List<Libary> libaries;

    private static void init() {
        categories = new ArrayList<>();
        libaries = new ArrayList<>();
    }

    public static void main(String[] args) {
        // khoi tao gia tri
        init();
        // dinh nghia chuyen muc
        Category math = new Category("Math", "Math category book");
        Category technology = new Category("Technology", "Technology over the world");
        Category biology = new Category("Biology", "Biology for everyone");

        // them chuyen muc
        categories.add(math);
        categories.add(technology);
        categories.add(biology);

        // hien thi danh sach chuyen muc
//        System.out.print("Hien thi danh sach chuyen muc: \n");
//        categories.forEach((c)-> c.displayCategoryInfo());
//        System.out.println("----------------------------------- \n-----------------------------------");
        /*
           -----------------------------------------
           -----------------------------------------
           -----------------------------------------
        */

        // dinh nahia sach
        // math
        Book princeton  = new Book("0691118809", "The Princeton Companion to Mathematics", "Princeton University Press",  "2008", 31.98);
        Book factfulness = new Book("1250123828", "Ten Reasons We're Wrong About the World ", "Flatiron Books",  "2019", 12.90);
        Book mathWithBad = new Book("0316509035", "Math with Bad Drawings: Illuminating the Ideas That Shape Our Reality ", "Black Dog",  "2018", 20.77);

        // technology
        Book elonMusk = new Book("006230125X", "Elon Musk: Tesla, SpaceX, and the Quest for a Fantastic Future ", "Ecco",  "2017", 10.98);
        Book industriesOfTheFuture = new Book("1476753660", "The Industries of the Future", "Simon & Schuster",  "2017", 9.33);
        Book theInevitable = new Book("0143110373", "The Inevitable: Understanding the 12 Technological Forces That Will Shape Our Future ", "Penguin Books",  "2017", 10.55);

        // biology
        Book theBiologyColoringBook  = new Book("0064603075", "The Biology Coloring Book", "Collins Reference",  "1986", 16.18);
        Book biologyColoringWorkbook = new Book("0451487788", "Biology Coloring Workbook, 2nd Edition: An Easier and Better Way to Learn Biology", "Princeton Review",  "2017", 17.25);

        // add book to each category
        // math
        math.addBook(princeton);
        math.addBook(factfulness);
        math.addBook(mathWithBad);

        // technology
        technology.addBook(elonMusk);
        technology.addBook(industriesOfTheFuture);
        technology.addBook(theInevitable);

        // biology
        biology.addBook(theBiologyColoringBook);
        biology.addBook(biologyColoringWorkbook);

        // hien thi sach cua tung chuyen muc
//        System.out.print("Hien thi sach cua tung chuyen muc: \n");
//        categories.forEach((c) -> {
//                    System.out.println("---------");
//                    c.displayCategoryInfo();
//                    c.getListBook().forEach((b) ->
//                            b.displayBookInfo());
//                });
//        System.out.println("----------------------------------- \n-----------------------------------");

        // dinh nghia danh sach tac gia

        Author timothyGowers = new Author("Timothy Gowers", "Male", "20-11-1963", "England");
        Author juneBarrowGreen = new Author("June Barrow-Green", "Female", "05-10-1973", "England");
        Author imreLeader = new Author("Imre Leader", "Male", "30-10-1963", "England");

        Author hansRosling = new Author("Hans Rosling", "Male", "27-07-1948", "Swedish");
        Author annaRosling = new Author("Anna Rosling Rönnlund", "Female", "04-07-1975", "Swedish");
        Author olaRosling = new Author("Ola Rosling", "Male", "01-11-1975", "Swedish");

        Author benOrlin = new Author("Ben Orlin", "Male", "25-06-1985", "United States");

        Author ashleeVance = new Author("Ashlee Vance", "Male", "15-04-1977", "United States");

        Author alecRoss = new Author("Alec Ross", "Male", "30-11-1971", "United States");

        Author kevinKelly = new Author("Kevin Kelly", "Male", "14-08-1952", "United States");

        Author robertGriffin = new Author("Robert D. Griffin", "Male", "11-04-1963", "Canada");
        Author cintheaVadala = new Author("Cinthea Vadala", "FeMale", "18-05-1993", "Spain");

        Author edwardAlcamo = new Author("Edward Alcamo", "Male", "03-02-1990", "Portugal");

        // add author to book
        princeton.addAuthor(timothyGowers);
        princeton.addAuthor(juneBarrowGreen);
        princeton.addAuthor(imreLeader);

        factfulness.addAuthor(hansRosling);
        factfulness.addAuthor(annaRosling);
        factfulness.addAuthor(olaRosling);

        mathWithBad.addAuthor(benOrlin);

        elonMusk.addAuthor(ashleeVance);

        industriesOfTheFuture.addAuthor(alecRoss);

        theInevitable.addAuthor(kevinKelly);

        theBiologyColoringBook.addAuthor(robertGriffin);
        theBiologyColoringBook.addAuthor(cintheaVadala);

        biologyColoringWorkbook.addAuthor(edwardAlcamo);

        // hien thi danh sacsh tac gia cua tung sach trong tung chuyen muc
//        System.out.print("Hien thi danh sach tac gia cua tung sach trong tung chuyen muc: \n");
//        categories.forEach((c) -> {
//                System.out.println("---------");
//                c.displayCategoryInfo();
//                c.getListBook().forEach((b) -> {
//                    System.out.println("----");
//                    b.displayBookInfo();
//                    b.getListAuthor().forEach((a)-> {
//                        a.displayAuthorInfo();
//                    });
//                });
//            }
//        );
//        System.out.println("----------------------------------- \n-----------------------------------");

        // dinh nghia thu vien
        Libary haiChau = new Libary("02 Tan Lap - Hai Chau - Da Nang");
        Libary sonTra = new Libary("319 Ngo Quyen - Son Tra - Da Nang");
        Libary thanhKhe = new Libary("19 Dien Bien Phu - Thanh Ke - Da Nang");

        // them thu vien vao danh sach
        libaries.add(haiChau);
        libaries.add(sonTra);
        libaries.add(thanhKhe);

        // dinh nghia libbook
        LibaryBook floor1rack1 = new LibaryBook(princeton, "Tang 1 - Ke 1", "15-06-2019", 15);
        LibaryBook floor1rack2 = new LibaryBook(factfulness, "Tang 1 - Ke 2", "01-07-2019", 30);
        LibaryBook floor1rack3 = new LibaryBook(mathWithBad, "Tang 1 - Ke 3", "02-07-2019", 100);

        LibaryBook floor2rack1 = new LibaryBook(elonMusk, "Tang 2 - Ke 1", "03-05-2019", 15);
        LibaryBook floor2rack2 = new LibaryBook(industriesOfTheFuture, "Tang 2 - Ke 2", "19-02-2019", 30);
        LibaryBook floor2rack3 = new LibaryBook(theInevitable, "Tang 2 - Ke 3", "30-01-2019", 100);

        LibaryBook floor3rack1 = new LibaryBook(theBiologyColoringBook, "Tang 3 - Ke 1", "07-12-2019", 15);
        LibaryBook floor3racl2 = new LibaryBook(biologyColoringWorkbook, "Tang 3 - Ke 2", "16-03-2019", 30);

        // them libook vao lib
        libaries.forEach((l)-> {
            l.addLibBook(floor1rack1);
            l.addLibBook(floor1rack2);
            l.addLibBook(floor1rack3);
            l.addLibBook(floor2rack1);
            l.addLibBook(floor2rack2);
            l.addLibBook(floor2rack3);
            l.addLibBook(floor3rack1);
            l.addLibBook(floor3racl2);
        });

        // hien thi danh sacsh libbook cua tung thu vien
//        System.out.print("Hien thi danh sach libbook cua tung thu vien: \n");
//        libaries.forEach((l) -> {
//            System.out.println("---------");
//            l.displayInfoLibary();
//            l.getLibBook().forEach((lb) -> {
//                lb.displayInfoLibaryBook();
//            });
//        });
//        System.out.println("----------------------------------- \n-----------------------------------");
        // loan book student


        Student student = new Student("Tommy Dang", "18/05/2019", "ADL05", "IT");
        Map<Book, Integer> listBookLoan = new HashMap<>();
        listBookLoan.put(princeton, 10);
        listBookLoan.put(factfulness, 5);
        // sinh vien muon sach o nha sach hai chau , so luong 15 = 10 + 5
        student.loanBook(haiChau, listBookLoan, "05/07/2019", 15);
        student.displayStudentInfo();
        haiChau.getLibBook().forEach((lb)-> {
            lb.displayInfoLibaryBook();
        });
    }
}
