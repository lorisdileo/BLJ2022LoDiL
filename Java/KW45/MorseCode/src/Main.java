import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("*******************************************");
        System.out.println("Willkommen zum Morse Übersetzter.");
        System.out.println("*******************************************");

        while (true) {
            System.out.println("Welches Wort willst du übersetzten");
            String userInput = scan.nextLine();


            for (int i = 0; i < userInput.length(); i++) {
                Map<Character, String> Mcode = new HashMap<Character, String>();
                Mcode.put('a', " .- ");
                Mcode.put('b', " -... ");
                Mcode.put('c', " -.-. ");
                Mcode.put('d', " -.. ");
                Mcode.put('e', " . ");
                Mcode.put('f', " ..-. ");
                Mcode.put('g', " --. ");
                Mcode.put('h', " .... ");
                Mcode.put('i', " .. ");
                Mcode.put('j', " .--- ");
                Mcode.put('k', " -. ");
                Mcode.put('l', " .-.. ");
                Mcode.put('m', " -- ");
                Mcode.put('n', " -. ");
                Mcode.put('o', " --- ");
                Mcode.put('p', " .--. ");
                Mcode.put('q', " --.- ");
                Mcode.put('r', " .-. ");
                Mcode.put('s', " ... ");
                Mcode.put('t', " - ");
                Mcode.put('u', " ..- ");
                Mcode.put('v', " ...- ");
                Mcode.put('w', " .-- ");
                Mcode.put('x', " -..- ");
                Mcode.put('y', " -.-- ");
                Mcode.put('z', " --.. ");
                Mcode.put(' ', " / ");
                System.out.print(Mcode.get(userInput.charAt(i)));
            }
            System.out.println("");
        }
    }
}
