public class Fish {
    String name;
    int x, y;
    Aquarium aquarium;
    boolean waterType;

    public Fish(String name, int x, int y, Aquarium aquarium, boolean waterType) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.aquarium = aquarium;
        this.waterType = waterType;
    }

    private void left(int amtStep) {
        while (this.x < aquarium.size - 1 && amtStep > 0) {
            y--;
            amtStep--;
        }
    }

    private void right(int amtStep) {
        while (this.y > 0 && amtStep > 0) {
            y++;
            amtStep--;
        }
    }

    private void up(int amtStep) {
        while (this.x > 0 && amtStep > 0) {
            x--;
            amtStep--;
        }
    }

    private void down(int amtStep) {
        while (this.x < aquarium.size - 1 && amtStep > 0) {
            x++;
            amtStep--;
        }
    }

    public void moveFish(int direction, int amtSteps) {
        switch (direction) {
            case 0 -> left(amtSteps);
            case 1 -> right(amtSteps);
            case 2 -> up(amtSteps);
            case 3 -> down(amtSteps);
            default -> {
            }
        }
    }
}