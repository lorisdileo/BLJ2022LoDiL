import java.awt.geom.Point2D;
import java.util.ArrayList;

public class CSLineSegement extends CSPoint {

    private ArrayList<CSPoint> linearray = new ArrayList();
    CSPoint start = new CSPoint(70, 120);
    CSPoint end = new CSPoint(-30, -80);

    public CSPoint getStart() {
        return start;
    }

    public CSPoint getEnd() {
        return end;
    }

    public ArrayList<CSPoint> getAllLines() {
        return linearray;
    }

}

