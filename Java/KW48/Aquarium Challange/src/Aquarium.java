import java.util.ArrayList;
import java.util.Scanner;

public class Aquarium {
    int size;
    Scanner scan = new Scanner(System.in);
    ArrayList<ArrayList<Boolean>> tank = new ArrayList<>();
    ArrayList<Fish> fishes = new ArrayList<>();
    boolean waterType;
    boolean isRunning = true;

    public void start(){
        System.out.println("---------------------------------------------------------------");
        System.out.println("                     The aquarium-program                      ");
        System.out.println("---------------------------------------------------------------" + "\n");
        System.out.println("Was willst du machen?");
    }

    public Aquarium(int size) {
        this.size = size;
    }

    public void initalize_tank() {
        for (int i = 0; i < this.size; i++) {
            tank.add(i, new ArrayList<>());
            for (int k = 0; k < this.size; k++) {
                tank.get(i).add(k, false);
            }
        }
    }

    private void clearArray() {
        for (int i = 0; i < this.size; i++) {
            for (int k = 0; k < this. size; k++) {
                tank.get(i).set(k, false);
            }
        }
    }

    private void getFish() {
        clearArray();
        for (Fish fish: fishes) {
            tank.get(fish.x).set(fish.y, true);
        }
    }

    public void printAquarium() {
        getFish();
        System.out.println("\n");

        for (int i = 0; i < this.size * 4 + 5; i++) {
            System.out.print("▓");
        }
        System.out.println();

        for (ArrayList<Boolean> arr: tank) {
            System.out.print("▓");
            for (Boolean i: arr) {
                if (i) {
                    System.out.print(" 🐠 ");
                } else {
                    System.out.print(" 🌊 ");
                }
            }
            System.out.print("▓\n");
        }

        for (int i = 0; i < this.size * 4 + 5; i++) {
            System.out.print("▓");
        }
        System.out.print("\n\n");
    }

    public void addFish() {
        System.out.print("Name: ");
        String name = scan.next();

        System.out.print("X-Cord: ");
        int x = scan.nextInt();

        System.out.print("Y-Cord: ");
        int y = scan.nextInt();

        if (x >= this.size) {
            x = this.size - 1;
        }

        if (y >= this.size) {
            y = this.size - 1;
        }

        Fish fish = new Fish(name, x, y, this, this.waterType);
        fishes.add(fish);
    }

    private Fish selectFish() {
        int i = 0;
        System.out.println("\nFishes: ");
        for (Fish fish: fishes) {
            System.out.printf("[%d] %s (%d, %d)\n", i, fish.name, fish.x, fish.y);
            i++;
        }

        System.out.print("\n--> ");
        int choice = scan.nextInt();

        int k = 0;
        for (Fish fish: fishes) {
            if (k == choice) {
                return fish;
            }
            k++;
        }
        return null;
    }

    public void removeFish() {
        Fish fish = selectFish();
        fishes.remove(fish);
    }

    private void moveFish() {
        Fish fish = selectFish();

        System.out.println("\nRichtung: ");
        System.out.println("\t[0] links");
        System.out.println("\t[1] rechts");
        System.out.println("\t[2] nach oben");
        System.out.println("\t[3] nach unten");
        System.out.print("\n--> ");
        int direction = scan.nextInt();

        System.out.println("Wie viele Felder??");
        System.out.print("--> ");
        int amtSteps = scan.nextInt();

        assert fish != null;
        fish.moveFish(direction, amtSteps);
    }

    public void editFish() {
        System.out.println("\nWas willst du machen?:");
        System.out.println("\t[0] Fisch hinzufügen");
        System.out.println("\t[1] Fisch entfernen");
        System.out.println("\t[2] Fisch bewegen");
        System.out.println("\t[9] Programm beenden");
        System.out.print("\n--> ");

        int selectNumber = scan.nextInt();

        switch (selectNumber) {
            case 0 -> addFish();
            case 1 -> removeFish();
            case 2 -> moveFish();
            case 9 -> isRunning = false;
            default -> {
            }
        }
    }
}
