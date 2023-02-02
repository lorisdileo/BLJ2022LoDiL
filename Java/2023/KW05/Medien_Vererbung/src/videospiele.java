public class videospiele extends Medien{

    private int preis;

    public videospiele(int preis, String title, int erscheinungsjahr, String sprache, String hersteller) {
        super(title, erscheinungsjahr, sprache, hersteller);
        this.preis = preis;
    }

    @Override
    public void printInfo(){
        String moreInfo = "\nPreis: " + preis;
        System.out.println(moreInfo);
        super.printInfo();
    }
    public void setPreis(int preis) {
        this.preis = preis;
    }

    public int isPreis() {
        return preis;
    }

}
