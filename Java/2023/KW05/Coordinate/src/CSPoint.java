import java.awt.*;

public class CSPoint extends Point {

    private int ID = 0;
    private int countID = 1;

    public CSPoint(int x, int y) {
        super(x, y);
        this.ID = ID;
        this.countID = countID;
    }

    public CSPoint(){
        super();
        this.ID = countID;
        ++countID;
    }

    public CSPoint(int x1, int y1, int x2, int y2) {
    }

    @Override
    public String toString() {
        return "CSPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
