import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie die erste Zahl ein.");
        int ersterInput = scan.nextInt();

        System.out.println("Geben Sie die Zweite Zahl ein.");
        int zweiterInput = scan.nextInt();

        int resultat = 0;
        for (int i = ersterInput; i <= zweiterInput; i++) {
            resultat += i;
        }
        System.out.println("Sie Summe von " + ersterInput + " bis " + zweiterInput + " ist " + resultat);
    }
}