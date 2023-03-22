import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

public class Game {
    Main main = new Main();
    static int[][] cards = new int[4][4];
    static boolean openCover[][] = new boolean[4][4];
    static Scanner scan = new Scanner(System.in);

    public static void setupGame() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                openCover[i][j] = false;
            }
        }
        cards = randCards();
    }

    public static void gamingBoard(boolean[][] openCover, int[][] cards) {

        System.out.println("     1 2 3 4 ");
        System.out.println("---+---------");
        for (int i = 0; i < 4; i++) {
            System.out.print(" " + (i + 1) + " | ");
            for (int j = 0; j < 4; j++) {
                if (openCover[i][j]) {
                    System.out.print(cards[i][j]);
                    System.out.print(" ");
                } else
                    System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] randCards() {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8};
        int cards[][] = new int[4][4];
        Random random = new Random();
        int temp = 0;
        int var = 0;
        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j < 16; j++) {
                var = random.nextInt(1000) % 15;
                temp = numbers[j];
                numbers[j] = numbers[var];
                numbers[var] = temp;

            }
            var = 0;
            for (int x = 0; x < 4; x++) {
                for (int y = 0; y < 4; y++) {
                    cards[x][y] = numbers[var];
                    var = var + 1;
                }
            }

        }
        return cards;
    }

    public static void gameGerman(boolean[][] openCover, int[][] cards) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\loris\\Dokumente\\GitHub\\BLJ2022LoDiL\\Java\\2023\\KW12\\Memory\\src\\german.properties");
        prop.load(fis);

        String value = prop.getProperty("foundItems");
        int noDownCards = 16;
        while (noDownCards > 0) {
            gamingBoard(openCover, cards);
            String firstCoordinate = prop.getProperty("firstCoordinate");
            System.out.println(firstCoordinate);
            int g1 = scan.nextInt();
            int g12 = scan.nextInt();
            int g1x = (g1) - 1;
            int g1y = (g12) - 1;
            System.out.println(cards[g1x][g1y]);

            String secondCoordinate = prop.getProperty("secondCoordinate");
            System.out.println(secondCoordinate);
            int g2 = scan.nextInt();
            int g22 = scan.nextInt();
            int g2x = (g2) - 1;
            int g2y = (g22) - 1;
            System.out.println(cards[g2x][g2y]);
            if (cards[g1x][g1y] == cards[g2x][g2y]) {
                String foundItems = prop.getProperty("foundItems");
                System.out.println(foundItems);
                openCover[g1x][g1y] = true;
                openCover[g2x][g2y] = true;
                noDownCards -= 2;
            }
        }
        gamingBoard(openCover, cards);
        String gameWin = prop.getProperty("gameWin");
        System.out.println(gameWin);
        //System.out.println("You win");
    }

    public static void gameEnglish(boolean[][] openCover, int[][] cards) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\loris\\Dokumente\\GitHub\\BLJ2022LoDiL\\Java\\2023\\KW12\\Memory\\src\\english.properties");
        prop.load(fis);

        String value = prop.getProperty("foundItems");
        int noDownCards = 16;
        while (noDownCards > 0) {
            gamingBoard(openCover, cards);
            String firstCoordinate = prop.getProperty("firstCoordinate");
            System.out.println(firstCoordinate);
            int g1 = scan.nextInt();
            int g12 = scan.nextInt();
            int g1x = (g1) - 1;
            int g1y = (g12) - 1;
            System.out.println(cards[g1x][g1y]);

            String secondCoordinate = prop.getProperty("secondCoordinate");
            System.out.println(secondCoordinate);
            int g2 = scan.nextInt();
            int g22 = scan.nextInt();
            int g2x = (g2) - 1;
            int g2y = (g22) - 1;
            System.out.println(cards[g2x][g2y]);
            if (cards[g1x][g1y] == cards[g2x][g2y]) {
                String foundItems = prop.getProperty("foundItems");
                System.out.println(foundItems);
                openCover[g1x][g1y] = true;
                openCover[g2x][g2y] = true;
                noDownCards -= 2;
            }
        }
        gamingBoard(openCover, cards);
        String gameWin = prop.getProperty("gameWin");
        System.out.println(gameWin);
    }

    public static void gameItalian(boolean[][] openCover, int[][] cards) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\loris\\Dokumente\\GitHub\\BLJ2022LoDiL\\Java\\2023\\KW12\\Memory\\src\\italia.properties");
        prop.load(fis);

        String value = prop.getProperty("foundItems");
        int noDownCards = 16;
        while (noDownCards > 0) {
            gamingBoard(openCover, cards);
            String firstCoordinate = prop.getProperty("firstCoordinate");
            System.out.println(firstCoordinate);
            int g1 = scan.nextInt();
            int g12 = scan.nextInt();
            int g1x = (g1) - 1;
            int g1y = (g12) - 1;
            System.out.println(cards[g1x][g1y]);

            String secondCoordinate = prop.getProperty("secondCoordinate");
            System.out.println(secondCoordinate);
            int g2 = scan.nextInt();
            int g22 = scan.nextInt();
            int g2x = (g2) - 1;
            int g2y = (g22) - 1;
            System.out.println(cards[g2x][g2y]);
            if (cards[g1x][g1y] == cards[g2x][g2y]) {
                String foundItems = prop.getProperty("foundItems");
                System.out.println(foundItems);
                openCover[g1x][g1y] = true;
                openCover[g2x][g2y] = true;
                noDownCards -= 2;
            }
        }
        gamingBoard(openCover, cards);
        String gameWin = prop.getProperty("gameWin");
        System.out.println(gameWin);
    }

    public static int[][] shuf() {
        int start[] = {1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8};
        int cards[][] = new int[4][4];
        Random ran = new Random();
        int tmp = 0;
        int tam = 0;
        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j < 16; j++) {
                tam = ran.nextInt(100000) % 15;
                tmp = start[j];
                start[j] = start[tam];
                start[tam] = tmp;
            }
        }
        tam = 0;

        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                cards[x][y] = start[tam];
                tam = tam + 1;
            }
        }
        return cards;

    }
}


