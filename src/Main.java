import java.util.Date;
public class Main {
    public static void main(String[] args) {
      Reader[] reader = new Reader[2];
      Date date1 = new Date(2005,2,8);
      Date date2 = new Date(2004,8,7);

      reader[0] = new Reader("Sanzhar Berkamalov", 555, "SE", date1, 7708551);
      reader[1] = new Reader("Rahznas Volamakreb", 001, "CS", date1, 7747209);
      reader[0].takebook("State");
      reader[0].returnbook("Little women");
      Book book1 = new Book("Dva Kapitana", "Veniamin Kaverin");
      Book book2 = new Book("All Quiet on the Western Front", "Erich Maria Remarque");
      reader[0].takebook(book1, book2);
      System.out.println();
      reader[0].returnbook(book1, book2);
    }
}