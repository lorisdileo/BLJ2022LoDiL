import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Aquarium {
    Scanner scan = new Scanner(System.in);
    private int size;
    private ArrayList<Fish> fishies = new ArrayList<>();
    private int[][] field;

    public Aquarium(int size) {
        this.size = size;
        field = new int[size][size];
    }

    public void addFish(int userInputX, int userInputY, String name) {
        field[userInputX][userInputY] = 1;
        Fish getName = new Fish(name, userInputX, userInputY);
        fishies.add(getName);
    }
    public  void removeFish(String name) {
        for (Fish currentFish : fishies) {
            if (name.equals(currentFish.getName())) {
                fishies.remove(currentFish);
                field[currentFish.getX()][currentFish.getY()] = 0;
            }
        }
    }

    public void fishHinzufuegen() {
        System.out.println("Wie soll der Fisch heissen?");
        String name = scan.next();
        System.out.println("Geben Sie die X-Koordinate ein.");
        int userInputX = scan.nextInt();
        System.out.println("Geben Sie die Y-Koordinate ein.");
        int userInputY = scan.nextInt();
        addFish(userInputX, userInputY, name);
        printAquarium();
    }
        public void fishEnfernen() {
        System.out.println("Welchen Fisch willst du entfernen?");
        for (Fish fish : getFishies()) {
            System.out.println("- [" + fish.getName() + "]");
        }
        String name = scan.next();
        removeFish(name);
        printAquarium();
        System.out.println("*********************************");
    }

    public void fishAnzeigen(){
        System.out.println("Das Aquarium ist mit Süsswasser gefüllt.");
        printAquarium();
        for (Fish fish : getFishies()) {
            System.out.println("- [" + fish.getName() + "] an der Position: [" + fish.getX() + "][" + fish.getY() + "]");
        }
    }

    public void fishBewegen(){
        System.out.println("Welchen Fisch willst du bewegen?");

        for (int i = 0; i < getFishies().size(); i++) {
            Fish fish = getFishies().get(i);
            System.out.println("- [" + (i + 1) + "]. [" + fish.getName() + "] an der Position: [" + fish.getX() + "][" + fish.getY() + "]");
        }
        int inputMove = scan.nextInt();
        System.out.println("\nDirection: ");
        System.out.println("\t[0] left");
        System.out.println("\t[1] right");
        System.out.println("\t[2] up");
        System.out.println("\t[3] down");
        System.out.print("\n--> ");
        int direction = scan.nextInt();

        System.out.println("Wie viele Schritte?");
        int amtStep = scan.nextInt();
        assert getFishies() != null;

        printAquarium();
    }

    public ArrayList<Fish> getFishies() {
        return fishies;
    }

    public void printAquarium() {
        for (int i = -30; i < field.length; i++) {
            System.out.print("▓");
        }
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        String aquariumAsString = Arrays.deepToString(field);
        aquariumAsString = aquariumAsString.replace("[[", "▓").replace("], [", "▓\n▓").replace(", ", " ").replace("]]",
                "▓").replace("0", " 🌊 ").replace("1", " 🐠 ");
        System.out.println(aquariumAsString);

        for (int i = 0; i < field.length; i++) {
            System.out.print("▓▓▓▓▓▓▓▓");
        }
        System.out.println("▓");
    }
}
