import com.sun.jdi.connect.Connector;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        CSPoint point1 = new CSPoint(50, -90);

        CoordinateSystem cs = new CoordinateSystem(500);
        cs.getAllPoints().add(point1);
        CSRenderer cr = new CSRenderer(cs);
    }
}