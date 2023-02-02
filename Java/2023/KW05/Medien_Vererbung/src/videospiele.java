public class videospiele extends Medien{

    private int preis;

    public videospiele(String title, int erscheinungsjahr, String sprache, String hersteller, int preis) {
        super(title, erscheinungsjahr, sprache, hersteller);
        this.preis = preis;
    }
    public void setPreis(int preis) {
        this.preis = preis;
    }

    public int isPreis() {
        return preis;
    }

}
