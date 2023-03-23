import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList books = new ArrayList();

        Book book1 = new Book("Harry Potter", 145);
        Book book2 = new Book("Arsène Lupin", 348);
        Book book3 = new Book("Herr der Ringe", 567);

        books.add(book1);
        books.add(book2);
        books.add(book3);

        Collections.sort(books);

        System.out.println(book1.getTitle().compareTo(book2.getTitle()));




    }



}