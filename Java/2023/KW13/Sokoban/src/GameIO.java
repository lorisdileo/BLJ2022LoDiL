import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameIO extends JFrame {

    private Game game;
    private BufferedImage displayArea;

    private int scale;
    private double cellMargin;

    private final Map<Integer, Runnable> inputMap;
    private final Map<Integer, Color> colorMap;

    public GameIO(Game game, int scale, double cellMargin) {
        this.game = game;
        this.scale = scale;
        this.cellMargin = cellMargin;

        inputMap = Map.of(KeyEvent.VK_UP, game::moveUp, KeyEvent.VK_DOWN, game::moveDown,
                KeyEvent.VK_LEFT, game::moveLeft, KeyEvent.VK_RIGHT, game::moveRight, KeyEvent.VK_ESCAPE,
                game::escAction);
        colorMap = Map.of(0, Color.LIGHT_GRAY, 1, Color.BLACK, 2, Color.RED, 3, Color.BLUE, 4,
                Color.GREEN);

        initInput();
        initOutput();
        updateOutput();
    }

    private void initOutput() {
        displayArea = new BufferedImage(game.getRowCount() * scale, game.getColCount() * scale,
                BufferedImage.TYPE_INT_ARGB);

        this.getContentPane().add(new JLabel(new ImageIcon(displayArea)));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Sokoban");
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void initInput() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                game.hasWon();
                if (inputMap.containsKey(e.getKeyCode())) {
                    inputMap.get(e.getKeyCode()).run();
                    updateOutput();
                }
            }
        });
    }

    private void updateOutput() {
        Graphics2D g2d = (Graphics2D) displayArea.getGraphics();
        g2d.setStroke(new BasicStroke((float) (scale * cellMargin)));
        for (int x = 0; x < game.getRowCount(); x++) {
            for (int y = 0; y < game.getColCount(); y++) {
                int scaledX = x * scale + scale / 2;
                int scaledY = y * scale + scale / 2;
                g2d.setColor(colorMap.get(game.getField()[y][x]));
                g2d.drawLine(scaledX, scaledY, scaledX, scaledY);
            }
        }
        repaint();
    }
}