import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
         bücher HarryPotter = new bücher("Stein der Weisen" ,1997, "britisches Englisch", "Nicolas Flamel","Roman");
         filme IronMan = new filme("Robert Downey Jr.", "Iron Man 1", 2008, "Englisch", "Kevin Feige");
         cd Queen = new cd("Queen", "Platinum Collection", 2000, "Englisch", "Genesis");
         videospiele GTA5 = new videospiele(20, "Grand Theft Auto V", 2013, "Englisch", "Rockstar North");

        ArrayList<Medien> sammlung = new ArrayList<Medien>();

        sammlung.add(HarryPotter);
        sammlung.add(IronMan);
        sammlung.add(Queen);
        sammlung.add(GTA5);

        HarryPotter.printInfo();
        IronMan.printInfo();
        Queen.printInfo();
        GTA5.printInfo();

    }
}