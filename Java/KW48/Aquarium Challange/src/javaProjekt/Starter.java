package javaProjekt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Starter {
    private String userInput1;
    private String userInput2;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Starter printAqua = new Starter();
        Aquarium tank = new Aquarium(10);
        int [][]aquarium = new int [tank.size][tank.size];

        System.out.println("Geben Sie den Typ des Wassers an");
        System.out.println("*********************************");
        System.out.println("[1] Salzwasser");
        System.out.println("[2] Süsswasser");
        System.out.println("*********************************");
        int waterTyp = scan.nextInt();

        System.out.print("Das Aquarium ist mit ");
        if (waterTyp == 1){
            System.out.print("Salzwasser");
        } else {
            System.out.print("Süsswasser");
        }
        System.out.println(" gefüllt.");

        printAqua.printAquarium(aquarium);
        System.out.println("*********************************");
        System.out.println("Was wollen sie machen");
        System.out.println("[1] Fisch hinzufügen");
        System.out.println("[2] Fisch entfernen");
        System.out.println("[3] Fisch(e) anzeigen");
        int userInput1 = scan.nextInt();
        switch (userInput1) {
            case 1 -> {
                System.out.println("Wie soll der Fisch heissen?");
                String name = scan.next();
                System.out.println("Geben Sie die X-Koordinate ein.");
                int userInputX = scan.nextInt();
                System.out.println("Geben Sie die Y-Koordinate ein.");
                int userInputY = scan.nextInt();
                tank.addFish(userInputX, userInputY, aquarium, name, waterTyp);
                printAqua.printAquarium(aquarium);
            }
            case 2 -> {
                System.out.println("Welchen Fisch willst du töten?");
                int delete = scan.nextInt();
                System.out.println("*********************************");
            }
            case 3 -> {
                System.out.println("Das Aquarium ist mit Süsswasser gefüllt.");
                printAqua.printAquarium(aquarium);
            }
        }
    }

    public void printAquarium(int[][] aquarium) {
        for (int i = -30; i < aquarium.length; i++) {
            System.out.print("▓");
        }
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        String aquariumAsString = Arrays.deepToString(aquarium);
        aquariumAsString = aquariumAsString.replace("[[", "▓").replace("], [", "▓\n▓").replace(", ", " ").replace("]]",
                "▓").replace("0", " 🌊 ").replace("1", " 🐠 ");
        System.out.println(aquariumAsString);

        for (int i = 0; i < aquarium.length; i++) {
            System.out.print("▓▓▓▓▓▓▓▓");
        }
        System.out.println("▓");
    }

}
