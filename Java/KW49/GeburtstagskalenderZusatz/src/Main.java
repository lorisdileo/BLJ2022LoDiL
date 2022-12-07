import java.io.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String path = "src/Personen_Aufgabe_2022-2023_2.csv";//"src/Personen_Aufgabe_2022-2023_(csv).csv";
        String line = "";
        ArrayList<Person> persArr = new ArrayList<>();

        System.out.println("2022 haben Geburtstag im");

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                int year = Integer.parseInt(values[0]);
                int month = Integer.parseInt(values[1]);
                int day = Integer.parseInt(values[2]);
                String name = values[3];
                Person person = new Person(year, month, day, name);
                persArr.add(person);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        Person.dayRow(persArr);
        Person.printBd(persArr);
    }
}
