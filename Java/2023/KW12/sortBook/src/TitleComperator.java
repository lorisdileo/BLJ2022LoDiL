import java.util.Comparator;

public class TitleComperator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int NameCompare = o1.getTitle().compareTo(o2.getTitle());
        return NameCompare;
    }
}
