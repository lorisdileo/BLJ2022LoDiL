public class Vehicle {
    private String marke;
    private String farbe;
    private float ps;
    private float price;

    public Vehicle(String marke, String farbe, float ps, float price) {
        this.marke = marke;
        this.farbe = farbe;
        this.ps = ps;
        this.price = price;
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

    public float getPs() {
        return ps;
    }

    public void setPs(float ps) {
        this.ps = ps;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
