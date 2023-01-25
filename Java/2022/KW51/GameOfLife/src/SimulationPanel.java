import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This class is responsible for creating a visual output of a simulation of
 * Conway's Game of Life. It's based on the Java Swing GUI toolkit.
 *
 * @author surber
 *
 */
public class SimulationPanel extends JPanel implements PropertyChangeListener {
    private Simulation simulation;

    private BufferedImage simulationImage;
    private JFrame mainFrame;

    private int scale;
    private double cellMargin;

    /**
     * A constructor.
     *
     * @param width      An int value that should match the width of the simulation
     *                   field.
     * @param height     An int value that should match the height of the simulation
     *                   field.
     * @param scale      An int value that, combined with the width / size is
     *                   responsible for scaling the visual output and the
     *                   simulation window. The smalles valid value is 1 (no
     *                   scaling).
     * @param cellMargin A double value that dictates the size ratio of a cell and
     *                   its border. Example: A value of 0.9 means that 90% of a
     *                   cell is used for content, 10% for for border. A value of 1
     *                   means that there is no border at all between cells.
     */
    public SimulationPanel(int width, int height, int scale, double cellMargin) {
        this.scale = scale;
        this.cellMargin = cellMargin;

        this.setPreferredSize(new Dimension(width * scale + (int) (scale * (1 - cellMargin)),
                height * scale + (int) (scale * (1 - cellMargin))));

        simulationImage = new BufferedImage(width * scale, height * scale, BufferedImage.TYPE_INT_ARGB);
        mainFrame = new JFrame();
        mainFrame.setTitle("Conway's Game of Life");
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainFrame.add(this);
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);

        mainFrame.setVisible(true);
    }

    /**
     * A construcotr.
     *
     * @param simulation A {@link Simulation} object that should be rendered.
     * @param scale      An int value that, combined with the width / size is
     *                   responsible for scaling the visual output and the
     *                   simulation window. The smallest valid value is 1 (no
     *                   scaling).
     * @param cellMargin A double value that dictates the size ratio of a cell and
     *                   its border. Example: A value of 0.9 means that 90% of a
     *                   cell is used for content, 10% for for border. A value of 1
     *                   means that there is no border at all between cells.
     */
    public SimulationPanel(Simulation simulation, int scale, double borderRatio) {
        this(simulation.getFieldWidth(), simulation.getFieldHeight(), scale, borderRatio);

        this.simulation = simulation;
        this.simulation.addListener(this);
    }

    /**
     * This method gets called automagically whenever the state of the simulation
     * has changed, which most of the time is after every iteration. It is
     * responsible for building the visual output of the simulation.
     */
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        Graphics2D g2d = (Graphics2D) simulationImage.getGraphics();
        int[][] newField = (int[][]) evt.getNewValue();
        repaint();

        g2d.setStroke(new BasicStroke((float) (scale * cellMargin)));

        for (int x = 0; x < newField.length; x++) {
            for (int y = 0; y < newField[x].length; y++) {
                int scaledX = x * scale + scale / 2;
                int scaledY = y * scale + scale / 2;

                if (newField[x][y] == 1) {
                    g2d.setColor(Color.BLACK);
                } else {
                    g2d.setColor(Color.LIGHT_GRAY);
                }
                g2d.drawLine(scaledY, scaledX, scaledY, scaledX);
            }
        }
    }

    /**
     * This method is used to actually paint (render) the built visual output.
     */
    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(simulationImage, (int) (scale * (1 - cellMargin) / 2), (int) (scale * (1 - cellMargin) / 2), this);
    }

    public Simulation getSimulation() {
        return simulation;
    }

    public BufferedImage getSimulationImage() {
        return simulationImage;
    }

    public int getScale() {
        return scale;
    }
}