package ch.noseryoung.game;

import ch.noseryoung.io.GameIO;

public class SnakeThread extends Thread {

    private Game game;
    private GameIO gameIO;
    private int delay;

    public SnakeThread(Game game, GameIO gameIO, int delay) {
        this.game = game;
        this.gameIO = gameIO;
        this.delay = delay;
    }

    @Override
    public void run() {
        while(true) {
            Direction direction = game.getLastMovingDirection();
            switch (direction) {
                case UP -> game.moveUp();
                case DOWN -> game.moveDown();
                case LEFT -> game.moveLeft();
                case RIGHT -> game.moveRight();
            }

            gameIO.updateOutput();

            if (game.handleLoss() || game.handleWin()) {
                break;
            }

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}