package javaProjekt;

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
            System.out.println("[4] Programm beenden");
            int userInput1 = scan.nextInt();
            switch (userInput1) {
                case 1 -> {
                    System.out.println("Wie soll der Fisch heissen?");
                    String name = scan.next();
                    System.out.println("Geben Sie die X-Koordinate ein.");
                    int userInputX = scan.nextInt();
                    System.out.println("Geben Sie die Y-Koordinate ein.");
                    int userInputY = scan.nextInt();
                    tank.addFish(userInputX, userInputY, name, waterTyp);
                    tank.printAquarium();
                }
                case 2 -> {
                    System.out.println("Welchen Fisch willst du entfernen?");
                    for (Fish fish : tank.getFishies()) {
                        System.out.println("- [" + fish.getName() + "]");
                    }
                    String name = scan.next();
                    tank.removeFish(name);
                    tank.printAquarium();
                    System.out.println("*********************************");
                }
                case 3 -> {
                    System.out.println("Das Aquarium ist mit Süsswasser gefüllt.");
                    tank.printAquarium();
                    for (Fish fish : tank.getFishies()) {
                        System.out.println("- [" + fish.getName() + "] an der Koordinate: [" + fish.getX() + "][" + fish.getY() + "]");
                    }
                }
                case 4 -> {
                    isRunning = false;
                }
            }
        }
    }
}
