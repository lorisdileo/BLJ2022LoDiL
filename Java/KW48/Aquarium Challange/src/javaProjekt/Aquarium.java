package javaProjekt;

import java.util.ArrayList;

public class Aquarium {

    int size;
    ArrayList<Fish> fish = new ArrayList<>();

    public Aquarium(int size) {
        this.size = size;
    }

    public void addFish(int userInputX, int userInputY, int[][] aquarium, String name, Integer waterTyp) {
        aquarium[userInputX][userInputY] = 1;
        Fish Samuel = new Fish(name, waterTyp, userInputX, userInputY);
        fish.add(Samuel);

    }


}
