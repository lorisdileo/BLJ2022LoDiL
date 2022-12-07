import java.io.*;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Person[] persArr = new Person[40];

        File getCSVFiles = new File("src/Personen_Aufgabe_2022-2023_(csv).csv");
        Scanner scan = new Scanner(getCSVFiles);
        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }
        scan.close();
        Person.dayRow(persArr);
        Person.printBd(persArr);
    }
}
