import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;

public class Person {
    Scanner scan = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private LocalDate birthYear;

    public Person(String firstName, String lastName, LocalDate birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    /*public void createPersonInput(){
        System.out.print("Geben Sie den Vornamen ein: ");
        firstName = scan.next();

        System.out.println("Geben Sie den nachname ein: ");
        lastName = scan.next();

        System.out.println("Geben Sie das Geburtsdatum ein: ");
        birthYear = LocalDate.parse(scan.next());
    }*/

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(LocalDate birthYear) {
        this.birthYear = birthYear;
    }
}
