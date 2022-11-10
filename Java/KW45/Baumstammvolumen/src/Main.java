import java.util.Scanner;

public class Main {
    public static final double PI = 3.14159265358979323846;
    public int durchmesser;
    public int laenge;

    public void volumenAusgabe(int durchmesser, int laenge){
        double volumenBerechnung = PI / 4 * (durchmesser * durchmesser) * laenge / 10000;
        float Resultat = (float)volumenBerechnung; //hat Timofey mir gezeigt
        System.out.println("Das Volumen des Baumstamms beträgt " + Resultat);
    }
    public static void main(String[] args) {

        Main Baum = new Main();

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie die länge (in Meter) des Baumstamms ein.");
        int laenge = scan.nextInt();

        System.out.println("Geben Sie den Durchmesser (in cm) des Baumstamms ein.");
        int durchmesser = scan.nextInt();

        System.out.println("***********************");
        Baum.volumenAusgabe(durchmesser, laenge);
        System.out.println("***********************");
    }
}