public class filme extends Medien{

    private String hauptdarsteller;
    public filme(String hauptdarsteller, String title, int erscheinungsjahr, String sprache, String hersteller) {
        super(title, erscheinungsjahr, sprache, hersteller);
        this.hauptdarsteller = hauptdarsteller;
    }

    @Override
    public void printInfo(){
        String moreInfo = "\nHautdarsteller: " + hauptdarsteller;
        System.out.println(moreInfo);
        super.printInfo();
    }

    public String getHauptdarsteller() {
        return hauptdarsteller;
    }

    public void setHauptdarsteller(String hauptdarsteller) {
        this.hauptdarsteller = hauptdarsteller;
    }
}
