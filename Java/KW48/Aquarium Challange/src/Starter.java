import java.util.Scanner;

public class Starter {
    private String userInput1;
    private String userInput2;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Starter printAqua = new Starter();
        Aquarium tank = new Aquarium(10);

        System.out.println("Geben Sie den Typ des Wassers an");
        System.out.println("*********************************");
        System.out.println("[1] Salzwasser");
        System.out.println("[2] Süsswasser");
        System.out.println("*********************************");
        int waterTyp = scan.nextInt();
        boolean isRunning = true;

        System.out.print("Das Aquarium ist mit ");
        if (waterTyp == 1) {
            System.out.print("Salzwasser");
        } else {
            System.out.print("Süsswasser");
        }
        System.out.println(" gefüllt.");
        tank.printAquarium();

        while (isRunning) {
            System.out.println("*********************************");
            System.out.println("Was wollen sie machen");
            System.out.println("[1] Fisch hinzufügen");
            System.out.println("[2] Fisch entfernen");
            System.out.println("[3] Fisch(e) anzeigen");
            System.out.println("[4] Fisch bewegen");
            System.out.println("[5] Programm beenden");
            int userInput1 = scan.nextInt();
            switch (userInput1) {
                case 1 -> {
                    tank.fishHinzufuegen();
                }
                case 2 -> {
                    tank.fishEnfernen();
                }
                case 3 -> {
                    tank.fishAnzeigen();
                }
                case 4 -> {
                    tank.fishBewegen();
                }
                case 5 -> {
                    isRunning = false;
                }
            }
        }
    }
}
