import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class functions {
    public void noised() throws IOException {
        Color white = new Color(255, 255, 255);
        Color black = new Color(0, 0, 0);
        Random rand = new Random();


        File file = new File("C:\\Users\\loris\\Dokumente\\GitHub\\BLJ2022LoDiL\\Java\\2023\\KW10\\Noised\\src\\sami.jpg");
        BufferedImage image = ImageIO.read(file);

        int width = image.getWidth();
        int height = image.getHeight();
        double px = 0.25;


        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int rgb = image.getRGB(i, j);
                if (rand.nextDouble() < px) {
                    image.setRGB(i, j, white.getRGB());
                } else if (rand.nextDouble() < px) {
                    image.setRGB(i, j, black.getRGB());
                }
            }
        }

        ImageWriter writer = (ImageWriter) ImageIO.getImageWritersByMIMEType("image/jpeg").next();
        ImageOutputStream stream = ImageIO.createImageOutputStream(new File("sami.jpg"));
        writer.setOutput(stream);
        writer.write(image);
    }

    public void denoised() throws IOException {

        Color white = new Color(255, 255, 255);
        Color black = new Color(0, 0, 0);
        Random rand = new Random();


        File file = new File("C:\\Users\\loris\\Dokumente\\GitHub\\BLJ2022LoDiL\\Java\\2023\\KW10\\Noised\\sami.jpg");
        BufferedImage image = ImageIO.read(file);

        int width = image.getWidth();
        int height = image.getHeight();
        double px = 0.25;

        int totalRed = 0;
        int totalGreen = 0;
        int totalBlue = 0;
        int count = 0;

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int rgb = image.getRGB(i, j);
                if (rand.nextDouble() == white.getRGB() && rand.nextDouble() == black.getRGB()) {
                    Color pixelColor = new Color(image.getRGB(i, j));
                    totalRed = pixelColor.getRed();
                    totalGreen += pixelColor.getGreen();
                    totalBlue += pixelColor.getBlue();
                    count++;

                    if (count == 0) {
                        System.out.println("bye");
                    }

                    int averageRed = totalRed / count;
                    int averageGreen = totalGreen / count;
                    int averageBlue = totalBlue / count;

                    System.out.println(totalRed);
                    System.out.println(totalGreen);
                    System.out.println(totalBlue);


                    Color cl = new Color(averageRed, averageGreen, averageBlue);

                    image.setRGB(i, j, cl.getRGB());

                    JFrame rahmen = new JFrame();
                    rahmen.setSize(800, 1000);
                    JLabel logo = new JLabel(new ImageIcon(image));

                    rahmen.add(logo);
                    rahmen.setVisible(true);

                    /*ImageWriter wr = (ImageWriter) ImageIO.getImageWritersByMIMEType("image/jpeg").next();
                    ImageOutputStream str = ImageIO.createImageOutputStream(new File("samu.jpg"));
                    wr.setOutput(str);
                    wr.write(image);*/
                }
            }
        }
    }
}
