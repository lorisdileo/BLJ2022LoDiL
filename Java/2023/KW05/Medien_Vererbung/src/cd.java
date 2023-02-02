public class cd extends Medien{

    private String band;
    public cd(String band, String title, int erscheinungsjahr, String sprache, String hersteller) {
        super(title, erscheinungsjahr, sprache, hersteller);
        this.band = band;
    }

    @Override
    public void printInfo(){
        String moreInfo = "\nBand: " + getBand();
        System.out.println(moreInfo);
        super.printInfo();
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }
}
