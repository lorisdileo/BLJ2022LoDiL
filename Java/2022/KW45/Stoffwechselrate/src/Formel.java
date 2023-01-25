public class Formel {
    private int gewichtMann;
    private int groesseMann;
    private int alterMann;

    private int gewichtFrau;
    private  int groesseFrau;
    private int alterFrau;


    public Formel( ) {

    }

    public void setGewichtMann(int gewichtMann) {

        this.gewichtMann = gewichtMann;
    }
    public void setGroesseMann(int groesseMann) {

        this.groesseMann = groesseMann;
    }
    public void setAlterMann(int alterMann) {

        this.alterMann = alterMann;
    }

    public void setGewichtFrau(int gewichtFrau) {

        this.gewichtFrau = gewichtFrau;
    }
    public void setGroesseFrau(int groesseFrau) {

        this.groesseFrau = groesseFrau;
    }
    public void setAlterFrau(int alterFrau) {

        this.alterFrau = alterFrau;
    }

    public void mannAusgabe() {
        float calorienMann = 66.47f + 13.7f * gewichtMann + 5f * groesseMann - 6.8f * alterMann;
        System.out.println("Du nimmst " + calorienMann + " Kalorein pro Tag");
    }

    public void frauAusgabe() {
        float calorienFrau = 655.1f + 9.6f * gewichtFrau +1.8f * groesseFrau - 4.7f * alterFrau;
        System.out.println("Du nimmst " + calorienFrau + " Kalorein pro Tag");
    }

    public int getGewichtMann() {

        return gewichtMann;
    }

    public int getGroesseMann() {

        return groesseMann;
    }
    public int getAlterMann() {

        return alterMann;
    }

    public int getGewichtFrau() {

        return gewichtFrau;
    }
    public int getGroesseFrau() {

        return groesseFrau;
    }
    public int getAlterFrau() {

        return alterFrau;
    }
}