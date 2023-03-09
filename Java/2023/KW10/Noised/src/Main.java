import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {

        Color white = new Color(255, 255, 255);
        Color black = new Color(0, 0, 0);
        Random rand = new Random();

        try {
            File file = new File("C:\\Users\\loris\\Dokumente\\GitHub\\BLJ2022LoDiL\\Java\\2023\\KW10\\Noised\\src\\sami.jpg");
            BufferedImage image = ImageIO.read(file);

            int width = image.getWidth();
            int height = image.getHeight();

            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    int rgb = image.getRGB(i, j);
                    if (rand.nextDouble() < 0.25){
                        image.setRGB(i, j, white.getRGB());
                    } else if (rand.nextDouble() < 0.25) {
                        image.setRGB(i, j, black.getRGB());
                    }
                }
            }

            JFrame rahmen = new JFrame();
            rahmen.setSize(800, 1000);
            JLabel logo = new JLabel(new ImageIcon(image));

            rahmen.add(logo);
            rahmen.setVisible(true);
        }catch (IOException e){
            System.out.println(e);
        }
    }
}