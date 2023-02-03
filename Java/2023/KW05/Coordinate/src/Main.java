public class Main {
    public static void main(String[] args) {
        CoordinateSystem cs = new CoordinateSystem(500);
        CSRenderer cr = new CSRenderer(cs);
        cr.paintComponent(5);
    }
}