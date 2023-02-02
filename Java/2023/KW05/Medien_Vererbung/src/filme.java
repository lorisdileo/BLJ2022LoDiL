public class filme extends Medien{

    private String hauptdarsteller;
    public filme(String title, int erscheinungsjahr, String sprache, String hersteller, String hauptdarsteller) {
        super(title, erscheinungsjahr, sprache, hersteller);
        this.hauptdarsteller = hauptdarsteller;
    }

    public String getHauptdarsteller() {
        return hauptdarsteller;
    }

    public void setHauptdarsteller(String hauptdarsteller) {
        this.hauptdarsteller = hauptdarsteller;
    }
}
