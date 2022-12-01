package javaProjekt;

import java.util.ArrayList;
import java.util.Arrays;

public class Aquarium {

    private int size;
    private ArrayList<Fish> Fishies = new ArrayList<>();
    private int[][] field;

    public Aquarium(int size) {
        this.size = size;
        field = new int[size][size];
    }

    public void addFish(int userInputX, int userInputY, String name, Integer waterTyp) {
        field[userInputX][userInputY] = 1;
        Fish getName = new Fish(name, waterTyp, userInputX, userInputY);
        Fishies.add(getName);
    }
    public  void removeFish(String name) {
        for (Fish currentFish : Fishies) {
            if (name.equals(currentFish.getName())) {
                Fishies.remove(currentFish);
                field[currentFish.getX()][currentFish.getY()] = 0;
            }
        }
    }

    public ArrayList<Fish> getFishies() {
        return Fishies;
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
