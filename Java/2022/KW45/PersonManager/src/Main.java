import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Vorname");
        String vorName = scan.nextLine();

        System.out.println("Enter Nachname");
        String nachName = scan.nextLine();

        System.out.println("Enter Color");
        String favoriteColor = scan.nextLine();


        Person person1 = new Person();
        person1.setVorName(vorName);

        person1.setNachName(nachName);
        person1.setFavoriteColor(favoriteColor);

        System.out.println("***********************");
        person1.presentYourself();
        System.out.println("***********************");
    }
}