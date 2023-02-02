import javax.swing.*;

public class bücher extends Medien{
    private String genre;

    public bücher(String titel, int erscheinungsjahr, String sprache, String hersteller, String genre) {
        super(titel, erscheinungsjahr, sprache, hersteller);
        this.genre = genre;
    }

    @Override
    public void printInfo(){

        String moreInfo = "Genre: " + genre;
        System.out.println(moreInfo);
        super.printInfo();
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }
}
