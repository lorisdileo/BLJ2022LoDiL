import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Es wird geprüft, ob die Eingegebene Zahlenreihe ein Palindrom ist.");
        System.out.println("Geben Sie bitte eine Zahlenreihe ein.");
        String userNumber = scan.nextLine();

        String reverse = "";

        int length = userNumber.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + userNumber.charAt(i);
        }

        if (userNumber.equals(reverse)) {
            System.out.println(userNumber+ ", ist ein Palindrom");
        } else {
            System.out.println(userNumber+ ", ist kein Palindrom");
        }
    }
}