//hilfe Samuel Scherrer
public class Starter {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium(10);
        aquarium.initalize_tank();

        aquarium.start();

        while (aquarium.isRunning) {
            aquarium.printAquarium();
            aquarium.editFish();
        }
    }
}
