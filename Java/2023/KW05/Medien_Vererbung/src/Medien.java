public class Medien {
    private String titel;
    private int erscheinungsjahr;
    private String sprache;
    private String hersteller;

    public Medien(String title, int erscheinungsjahr, String sprache, String hersteller) {
    }

    public void printInfo() {
        String info = "Titel: " + titel +
                "\nErscheinungsdatum: " + erscheinungsjahr +
                "\nSprache: " + sprache +
                "\nHersteller: " + hersteller;
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
