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

        for (int y = 1; y < height - 1; y++) {
            for (int x = 1; x < width - 1; x++) {
                Color color = new Color(image.getRGB(x, y));


                /*if (color.equals(white) || color.equals(black)) {
                    continue;
                }*/

                int sumRed = 0;
                int sumGreen = 0;
                int sumBlue = 0;
                int count = 0;
                for (int j = -1; j <= 1; j++) {
                    for (int i = -1; i <= 1; i++) {
                        Color surroundingColor = new Color(image.getRGB(x + i, y + j));
                        if (!surroundingColor.equals(white) && !surroundingColor.equals(black)) {
                            sumRed += surroundingColor.getRed();
                            sumGreen += surroundingColor.getGreen();
                            sumBlue += surroundingColor.getBlue();
                            count++;
                        }
                    }
                }

                if (count > 0) {
                    int avgRed = sumRed / count;
                    int avgGreen = sumGreen / count;
                    int avgBlue = sumBlue / count;
                    Color avgColor = new Color(avgRed, avgGreen, avgBlue);
                    image.setRGB(x, y, avgColor.getRGB());
                }
            }
        }

        ImageWriter wr = (ImageWriter) ImageIO.getImageWritersByMIMEType("image/jpeg").next();
        ImageOutputStream str = ImageIO.createImageOutputStream(new File("samu.jpg"));
        wr.setOutput(str);
        wr.write(image);
    }
}


