import org.w3c.dom.Text;

import javax.swing.*;
import java.io.*;
import java.util.*;
import java.time.*;
import java.time.LocalDate;

public class FileIOHandler {
    public void printResult() throws IOException {


        BufferedReader br = new BufferedReader(new FileReader(TextFileAnalyzer.path));
        String line;
        String word = "";
        while ((line = br.readLine()) != null) {
            String[] words = line.split("[ \n\t,;.()+=<>!?]");
            for (String s : words) {
                String lowerCase = s.toLowerCase();
                if (!s.equals("")) {
                    if (TextFileAnalyzer.script.containsKey(lowerCase)) {
                        TextFileAnalyzer.script.put(lowerCase, TextFileAnalyzer.script.get(lowerCase) + 1);
                    } else {
                        TextFileAnalyzer.script.put(lowerCase, 1);
                    }
                    word = s;
                }
            }
        }
        br.close();
        int totalCount = 0;
        for (int count : TextFileAnalyzer.script.values()) {
            totalCount += count;
        }
        String mostWord = "";

        LocalDate today = LocalDate.now();
        System.out.printf("%s %s\n", today.toString(), TextFileAnalyzer.path);
        System.out.println("------------------------------------");
        System.out.println("Total number of unique words:\t" + TextFileAnalyzer.script.size());
        System.out.println("Total number of words:\t" + totalCount);
        System.out.println("Most common word:\t" );
        System.out.println(TextFileAnalyzer.script);
    }
}
