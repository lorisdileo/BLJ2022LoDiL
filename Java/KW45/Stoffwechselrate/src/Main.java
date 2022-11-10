import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welches Geschlecht hast du?");
        System.out.println("[1] Mann");
        System.out.println("[2] Frau");
        int geschlecht = scan.nextInt();

        switch (geschlecht) {
            case 1:
                Formel Mann = new Formel();
                System.out.println("Gebe dein Körpergewicht ein.");
                int gewichtMann = scan.nextInt();
                Mann.setGewichtMann(gewichtMann);

                System.out.println("Gebe deine Körpergrösse ein. (in cm)");
                int groesseMann = scan.nextInt();
                Mann.setGroesseMann(groesseMann);

                System.out.println("Gib dein Alter ein.");
                int alterMann = scan.nextInt();
                Mann.setAlterMann(alterMann);

                System.out.println("***********************");
                Mann.mannAusgabe();
                System.out.println("***********************");
                break;

            case 2:
                Formel Frau = new Formel();
                System.out.println("Gebe dein Körpergewicht ein.");
                int gewichtFrau = scan.nextInt();
                Frau.setGewichtFrau(gewichtFrau);

                System.out.println("Gebe deine Körpergrösse ein. (in cm)");
                int groesseFrau = scan.nextInt();
                Frau.setGroesseFrau(groesseFrau);

                System.out.println("Gib dein Alter ein.");
                int alterFrau = scan.nextInt();
                Frau.setAlterFrau(alterFrau);

                System.out.println("***********************");
                Frau.frauAusgabe();
                System.out.println("***********************");
                break;
        }
    }
}