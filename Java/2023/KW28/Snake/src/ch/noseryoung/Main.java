package ch.noseryoung;

import ch.noseryoung.game.Game;
import ch.noseryoung.io.GameIO;
public class Main {
    public static void main(String[] args) {
        new GameIO(new Game(10, 10, 10), 50, 0.9);
    }
}
