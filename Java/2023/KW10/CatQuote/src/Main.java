import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {

        String line = "Empty";


        URL urltxt = new URL("https://zenquotes.io/api/random");
        System.out.println(urltxt);

        Scanner sc = new Scanner(urltxt.openStream());

        while (sc.hasNextLine()) {
            line = sc.nextLine().trim();

            Pattern pt = Pattern.compile("\"(?:[^\"]*?\"){2}([^\"]*?)\"");
            Matcher mt = pt.matcher(line);
            if (mt.find()) {
                String quote = mt.group(1);
                System.out.println("Quote: " + quote);
                URL url = new URL("https://cataas.com/cat/says/" + URLEncoder.encode(quote, StandardCharsets.UTF_8).replace("+", "%20"));


                BufferedImage image = ImageIO.read(url);


                JFrame rahmen = new JFrame();
                rahmen.setSize(800, 1000);
                JLabel logo = new JLabel(new ImageIcon(image));

                rahmen.add(logo);
                rahmen.setVisible(true);
            }
        }


    }
}
