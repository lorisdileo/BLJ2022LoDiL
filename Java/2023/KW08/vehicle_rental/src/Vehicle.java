public class Vehicle {
private String marke;
    private String farbe;
    private int ps; //float
    
    public Vehicle(String marke, String farbe, int ps){
        this.marke = marke;
        this.farbe = farbe;
        this.ps = ps;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }
}
