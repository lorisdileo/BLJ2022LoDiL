import java.util.Comparator;

public class Book implements Comparable<Book> {
    private String title;
    private int pages;


    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public int compareTo(Book o) {
        return 0;
    }
}
