import java.util.Objects;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        String[][] spiel = new String[12][5];
        String[] alfabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        Scanner scan = new Scanner(System.in);

        clearGameArray(spiel);

        System.out.println("Willkommen zum Wordl");

        System.out.println("Bitte geben Sie Ihr Name ein, damit wir Sie als Spieler registrieren können");
        String playerName = scan.nextLine();
        String toUpperCase = playerName.toUpperCase();
        wordl User1 = new wordl(toUpperCase);
        System.out.println("x: falscher Buchstbe");
        System.out.println("@: richtiger Buchstabe, aber an der falschen Position");
        System.out.println("*: richtiger Buchstabe und richtige Position");

        String ID = " ";
        int gespielteSpiele = 0;
        int anzahlVersuche = 0;
        int wins = 0;

        geheimWort wort1 = new geheimWort();
        String wort = wort1.getGeheimWort();

        String[] wortErraten = new String[5];

        String nochmalsSpielen = "Y";

        for (int i = 0; i < 5; i++) {
            wortErraten[i] = wort.substring(i, i + 1).toUpperCase();
        }
        spielfeld(spiel);
        int rounds = 0;

        System.out.println(wort);

        while ((nochmalsSpielen.equals("Y")) || (nochmalsSpielen.equals("y"))) {
            clearGameArray(spiel);
            boolean win = false;
            int nochVersuche = 6;
            int jetztigeReihe = 0;
            rounds += 1;

            while (!win && nochVersuche > 0) {
                System.out.print("Runde " + rounds + " Bitte geben Sie Ihre Vermutung ein: ");
                String wahl = scan.next();
                while (wahl.length() != 5) {
                    System.out.println("Deine Vermutung muss 5 Buchstaben enthalten");
                    System.out.print("Please enter in your guess: ");
                    wahl = scan.next();
                }
                String wahlUpperCase = wahl.toUpperCase();
                for (int i = 0; i < wahlUpperCase.length(); i++) {
                    for (int j = 0; j < alfabet.length; j++) {
                        if (wahlUpperCase.substring(i, i + 1).toUpperCase().equals(alfabet[j])) {
                            alfabet[j] = "#";
                        }
                    }
                }

                for (int col = 0; col < 5; col++) {
                    spiel[jetztigeReihe][col] = wahlUpperCase.substring(col, col + 1);
                }
                for (int x = 0; x < wortErraten.length; x++) {
                    if (spiel[jetztigeReihe][x].equals(wortErraten[x].toUpperCase())) {
                        spiel[jetztigeReihe + 1][x] = "*";
                    } else if (charakterInArray(wortErraten, spiel[jetztigeReihe][x])) {
                        spiel[jetztigeReihe + 1][x] = "@";
                    }

                    if (spiel[jetztigeReihe + 1][x] == (" ")) {
                        spiel[jetztigeReihe + 1][x] = "x";
                    }
                }

                jetztigeReihe++;
                nochVersuche--;

                spielfeld(spiel);

                win = gewinnPrüfen(spiel, jetztigeReihe);
                if (win) {
                    System.out.println("Du hast das Wort rausgefunden!!");
                    System.out.println("Du hast dafuer " + (6 - nochVersuche) + " Versuche gebraucht.");

                    User1.setWin();
                    User1.setAnzahlVersuche(6 - nochVersuche);

                } else {
                    jetztigeReihe++;
                }

                System.out.print("Das sind die Buchstaben die du noch nicht verwendet hast: ");
                for (int i = 0; i < alfabet.length; i++) {
                    System.out.print(alfabet[i] + " ");
                }
                System.out.println();
            }

            if (win == false) {
                System.out.println("Du hast keine Versuche mehr.");
            }
            System.out.println("Willst du noch mals spielen? Y oder N:");
            nochmalsSpielen = scan.next();
            if (nochmalsSpielen.equals("Y")) {

                geheimWort wort2 = new geheimWort();
                wort = wort2.getGeheimWort();

                if ((wort.equals("ZZZZZ"))) {
                    System.out.println("NO MORE WORDS LEFT");

                    User1.setGespielteSpiele();


                    break;
                } else {
                    clearGameArray(spiel);
                    for (int i = 0; i < 5; i++) {
                        wortErraten[i] = wort.substring(i, i + 1);
                    }
                }
            }
            gespielteSpiele++;
            User1.setGespielteSpiele();
        }
        System.out.println(User1.zuString());
        System.out.println("Anzahl Versuche" + User1);
    }

    public static void clearGameArray(String[][] tempSpiel) {
        for (int row = 0; row < tempSpiel.length; row++) {
            for (int col = 0; col < tempSpiel[row].length; col++) {
                tempSpiel[row][col] = " ";
            }
        }
    }

    public static void spielfeld(String[][] spiel) {
        for (int i = 0; i < spiel.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < spiel[0].length; j++) {
                System.out.print(spiel[i][j]);
            }
            System.out.println(" |");
        }
    }

    public static boolean gewinnPrüfen(String[][] g, int r) {
        int zählen = 0;
        for (int col = 0; col < g[0].length; col++) {
            if (g[r][col].equals("*")) {
                zählen++;
            }
        }
        if (zählen == 5) {
            return true;
        }
        return false;
    }

    public static boolean charakterInArray(String[] arr, String character) {
        boolean tr = false;
        for (String str : arr) {
            if (str.equals(character)) {
                tr = true;
                break;
            }
        }
        return tr;
    }
}
