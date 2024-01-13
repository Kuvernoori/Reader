import java.util.Date;
public class Reader {
    String FULLNAME;
    int cardnumber;
    String faculty;
    Date dateofbirth;
    int phone;
    public Reader(String FULLNAME, int cardnumber, String faculty, Date dateofbirth, int phone) {
        this.FULLNAME = FULLNAME;
        this.cardnumber = cardnumber;
        this.faculty = faculty;
        this.dateofbirth = dateofbirth;
        this.phone = phone;

    }
    public void takebook(String book) {
        System.out.println(FULLNAME + " is take the book named as " + book + " with special cardnumber: " + cardnumber);
    }
    public void returnbook(String book) {
        System.out.println(FULLNAME + " returned the book named as " + book + " with special cardnumber: " + cardnumber);
    }
    public void takebook(int amount) {
        System.out.println(FULLNAME + " took " + amount + " books.");
    }
    public void takebook(String... names) {
        System.out.print(FULLNAME + " took books: ");
        for (int i = 0; i < names.length; i++){
            System.out.print(names[i]);
            if (i < names.length - 1) {
                System.out.print(",");
            }
        }
    }
    public void takebook(Book... books) {
        System.out.println(FULLNAME + " took books: ");
        for (int i = 0; i < books.length; i++){
            System.out.print(books[i].getName() + " " + "by" + " " +  books[i].getAuthor());
            if (i < books.length - 1) {
                System.out.print(", ");
            }
        }
    }
    public void returnbook(Book... books) {
        System.out.println(FULLNAME + " returned books: ");
        for (int i = 0; i < books.length; i++){
            System.out.print(books[i].getName() + " " + "by" + " " +  books[i].getAuthor());
            if (i < books.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
