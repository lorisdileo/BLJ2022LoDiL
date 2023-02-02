import javax.swing.*;

public class bücher extends Medien{
    private String genre;
    public bücher(String title, int erscheinungsjahr, String sprache, String hersteller, String genre){
        super(title, erscheinungsjahr, sprache, hersteller);
        this.genre = genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }
}
