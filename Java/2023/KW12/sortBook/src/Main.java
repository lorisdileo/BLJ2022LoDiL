import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();

        Book book1 = new Book("Harry Potter", 145);
        Book book2 = new Book("Arsène Lupin", 348);
        Book book3 = new Book("Herr der Ringe", 567);

        books.add(book1);
        books.add(book2);
        books.add(book3);

        System.out.println(book1.getTitle().compareTo(book2.getTitle()));

    }
}