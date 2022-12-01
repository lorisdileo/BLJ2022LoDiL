package javaProjekt;

public class Fish {


    private String name;
    private Integer waterTyp;
    private int x, y;

    public Fish(String name, Integer waterTyp, int x, int y) {
        this.name = name;
        this.waterTyp = waterTyp;
        this.x = x;
        this.y = y;
    }

    public void moveFish(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return name;
    }
}
