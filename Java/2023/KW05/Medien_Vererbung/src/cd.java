public class cd extends Medien{

    private String band;
    public cd(String title, int erscheinungsjahr, String sprache, String hersteller, String band) {
        super(title, erscheinungsjahr, sprache, hersteller);
        this.band = band;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }
}
