public class Medien {
    private String titel;
    private int erscheinungsjahr;
    private String sprache;
    private String hersteller;

    public Medien(String titel, int erscheinungsjahr, String sprache, String hersteller) {
        this.titel = titel;
        this.erscheinungsjahr = erscheinungsjahr;
        this.sprache = sprache;
        this.hersteller = hersteller;
    }

    public void printInfo() {
        String info = "Titel: " + getTitel() +
                "\nErscheinungsdatum: " + getErscheinungsjahr() +
                "\nSprache: " + getSprache() +
                "\nHersteller: " + getHersteller();
        System.out.println(info);
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setErscheinungsjahr(int erscheinungsjahr) {
        this.erscheinungsjahr = erscheinungsjahr;
    }

    public void setSprache(String sprache) {
        this.sprache = sprache;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getTitel() {
        return titel;
    }

    public int getErscheinungsjahr() {
        return erscheinungsjahr;
    }

    public String getSprache() {
        return sprache;
    }

    public String getHersteller() {
        return hersteller;
    }
    
}
