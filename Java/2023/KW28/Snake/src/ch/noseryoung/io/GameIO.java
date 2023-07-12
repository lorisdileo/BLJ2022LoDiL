package ch.noseryoung.io;

import ch.noseryoung.game.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.Map;

public class GameIO extends JFrame {

    private final Map<Integer, Runnable> inputMap;
    private final Map<Integer, Color> colorMap;

    private Game game;
    private BufferedImage displayArea;

    private int scale;
    private double cellMargin;

    public GameIO(Game game, int scale, double cellMargin) {
        this.game = game;
        this.scale = Math.max(scale, 1);
        inputMap = Map.of(KeyEvent.VK_UP, game::moveUp, KeyEvent.VK_DOWN, game::moveDown,
                KeyEvent.VK_LEFT, game::moveLeft, KeyEvent.VK_RIGHT, game::moveRight, KeyEvent.VK_ESCAPE,
                game::escAction);
        this.cellMargin = Math.min(cellMargin, 1.0);
        colorMap = Map.of(0, Color.LIGHT_GRAY, 1, Color.YELLOW, 2, Color.GREEN, 3, Color.RED, 4,
                Color.BLUE);
        initInput();
        initOutput();
        updateOutput();
    }

    private void initOutput() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        displayArea = new BufferedImage(game.getRowCount() * scale, game.getColCount() * scale,
                BufferedImage.TYPE_INT_ARGB);
        this.setTitle("Snake");
        this.getContentPane().removeAll();
        this.getContentPane().add(new JLabel(new ImageIcon(displayArea)));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void initInput() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (inputMap.containsKey(e.getKeyCode())) {
                    inputMap.get(e.getKeyCode()).run();
                    updateOutput();
                }
            }
        });
    }

    private void updateOutput() {
        Graphics2D g2d = (Graphics2D) displayArea.getGraphics();
        for (int col = 0; col < game.getColCount(); col++) {
            for (int row = 0; row < game.getRowCount(); row++) {
                drawTile(g2d, row, col);
            }
        }
        repaint();
    }

    private void drawTile(Graphics2D g2d, int row, int col) {
        int scaledX = getScaledCellSize(row);
        int scaledY = getScaledCellSize(col);
        g2d.setStroke(new BasicStroke((float) (scale * cellMargin)));
        g2d.setColor(colorMap.get(game.getGameField()[col][row]));
        g2d.drawLine(scaledX, scaledY, scaledX, scaledY);
    }

    private int getScaledCellSize(int size) {
        return size * scale + scale / 2;
    }
}