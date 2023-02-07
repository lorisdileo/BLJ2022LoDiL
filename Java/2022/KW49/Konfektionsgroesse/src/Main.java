import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bitte geben Sie Ihr Geschlecht an.");
        System.out.println("***********************************");
        System.out.println("[1]: Mann");
        System.out.println("[2]: Frau");
        System.out.println("***********************************");

        int geschlecht = scan.nextInt();

        switch (geschlecht) {
            case 1: Formel.mannBerechnung();
            break;

            case 2: Formel.frauBerechnung();
            break;
        }
    }
}