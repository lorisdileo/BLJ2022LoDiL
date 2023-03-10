import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class function {

    public void aci() throws IOException {
        final int ASCII_WIDTH = 250;
        final int ASCII_HEIGHT = 150;

        final char[] ASCII_CHARS = {'@' , '#' , 'S' , '%' , '?' , '*' , '+' , ';' , ':' , ',' , '.'};


        BufferedImage image = ImageIO.read(new File("C:\\\\Users\\\\loris\\\\Dokumente\\\\GitHub\\\\BLJ2022LoDiL\\\\Java\\\\2023\\\\KW10\\\\Noised\\\\src\\\\sami.jpg"));


        BufferedImage bufferedImage = new BufferedImage(ASCII_WIDTH, ASCII_HEIGHT, BufferedImage.TYPE_INT_RGB);
        bufferedImage.getGraphics().drawImage(image, 0, 0, ASCII_WIDTH, ASCII_HEIGHT, null);


        StringBuilder asciiArt = new StringBuilder();
        for (int y = 0; y < ASCII_HEIGHT; y++) {
            for (int x = 0; x < ASCII_WIDTH; x++) {
                int pixel = bufferedImage.getRGB(x, y);
                int r = (pixel >> 16) & 0xff;
                int g = (pixel >> 8) & 0xff;
                int b = pixel & 0xff;
                int gray = (int) (0.2126 * r + 0.7152 * g + 0.0722 * b);
                int index = (gray * ASCII_CHARS.length) / 256;
                asciiArt.append(ASCII_CHARS[index]);
            }
            asciiArt.append("\n");
        }


        System.out.println(asciiArt);
    }
}


