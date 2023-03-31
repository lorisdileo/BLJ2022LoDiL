import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class Main {
    static Game gm = new Game();

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose a language:");
        System.out.println("- [1]: Englsh");
        System.out.println("- [2]: German");
        System.out.println("- [3]: Italian");
        int langu = scan.nextInt();

        switch (langu) {
            case 1:
                while (true) {
                    gm.setupGame();
                    gm.gameEnglish(gm.openCover, gm.cards);
                }

            case 2:
                while (true) {
                    gm.setupGame();
                    gm.gameGerman(gm.openCover, gm.cards);
                }

            case 3:
                while (true) {
                    gm.setupGame();
                    gm.gameItalian(gm.openCover, gm.cards);
                }
        }
    }
}












/*public class Main {
    public static void main(String[] args) {
        Game gm = new Game(5);
        Card[][] gameBoard = createField();
    }
}*/


