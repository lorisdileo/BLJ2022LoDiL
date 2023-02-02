import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
         bücher HarryPotter = new bücher("Stein der Weisen" ,1997, "britisches Englisch", "Nicolas Flamel", "Roman");
         filme IronMan = new filme("Iron Man 1", 2008, "Englisch", "Kevin Feige", "Robert Downey Jr.");
         cd Queen = new cd("Platinum Collection", 2000, "Englisch", "Genesis", "Queen");
         videospiele GTA5 = new videospiele("Grand Theft Auto V", 2013, "Englisch", "Rockstar North", 20);

        ArrayList<Medien> sammlung = new ArrayList<Medien>();

        sammlung.add(HarryPotter);
        sammlung.add(IronMan);
        sammlung.add(Queen);
        sammlung.add(GTA5);
    }
}