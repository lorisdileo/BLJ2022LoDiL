import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Formel {
    static Scanner scan = new Scanner(System.in);

    public static void mannBerechnung() {
        System.out.print("Geben Sie Ihre Grösse an: \t");
        Integer hoehe = scan.nextInt();

        System.out.print("Geben Sie Ihr Brustumfang an: \t");
        Integer brustumfang = scan.nextInt();

        System.out.println(hoehe + "cm gross, mit " + brustumfang + " cm Brustumfang: " + brustumfang / 2);
    }

    public static void frauBerechnung() {
        System.out.print("Geben Sie Ihre Grösse an: \t");
        Integer hoehe = scan.nextInt();

        System.out.print("Geben Sie Ihr Brustumfang an: \t");
        Integer brustumfang = scan.nextInt();

        if (hoehe > 170){
                System.out.println(hoehe + "cm gross, mit " + brustumfang + " cm Brustumfang: " + ((brustumfang / 2 - 6 )* 2));
        }

        if (hoehe < 164){
                System.out.println(hoehe + "cm gross, mit " + brustumfang + " cm Brustumfang: " + ((brustumfang / 2 - 6) / 2));
        }

        if (hoehe > 164 && hoehe < 170){
            System.out.println(hoehe + "cm gross, mit " + brustumfang + " cm Brustumfang: " + (brustumfang / 2 - 6));
        }
    }
}
