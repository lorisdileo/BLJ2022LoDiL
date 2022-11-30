import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> Rucksack = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Hallo und Willkommen zum Rucksack Spiel!");
        System.out.println("****************************************");

        while (true) {
            System.out.println("****************************************");
            System.out.println("Was willst du machen?");
            System.out.println("[0] Beenden");
            System.out.println("[1] Neues Objakt der Liste hinzufügen");
            System.out.println("[2] Lister anzeigen lassen");
            System.out.println("****************************************");
            int userEingabe = scan.nextInt();

            switch (userEingabe) {
                case 0:
                    System.out.println("Vielen Dank, das du mein Programm verewendet hast.");
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Was möchtest du einpacken? ");
                    String userInput = scan.next();
                    if(Rucksack.contains(userInput)) {
                        Rucksack.remove(userInput);
                    }
                    Rucksack.add(userInput);

                    System.out.println("Was du bis jetzt gepackt hast.");
                    for (String s : Rucksack) {
                        System.out.println("- [" + s + "]");
                    }
                    break;
                case 2:
                    for (String s : Rucksack) {
                        System.out.println("- [" + s + "]");
                    }
                    break;
            }
        }
    }
}