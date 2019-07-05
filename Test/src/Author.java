public class Author {
    private String name;
    private String gender;
    private String birthday;
    private String address;

    public Author(String name, String gender, String birthday, String address) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    public void displayAuthorInfo() {
        System.out.println("Ten tac gia: " + name
                        + "\n Gioi tinh: " + gender
                        + "\n Ngay Sinh: " + birthday
                        + "\n Dia chi: " + address );
    }
}
