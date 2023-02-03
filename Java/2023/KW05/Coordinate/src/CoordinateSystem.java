import java.util.ArrayList;

public class CoordinateSystem {

    private final int size;

    ArrayList<CSPoint> cs = new ArrayList<CSPoint>();



    public CoordinateSystem(int size){
        if (0 < size && size % 20 == 0){
            this.size = size;
        }else{
            throw new IllegalArgumentException();
        }
    }


    public int getCoordinateSystemSize() {
        return size;
    }

    public ArrayList<CSPoint> getAllPoints() {
        return cs;
    }
}
