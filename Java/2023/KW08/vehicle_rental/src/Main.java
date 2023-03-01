import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Dominic", "Heule", LocalDate.of(2001, 6,12));
        Vehicle lambo = new Vehicle("Lamborghini", "Blau", 1100);

        VehicleRentalManager vh = new VehicleRentalManager();
        Contract ca = new Contract("p1", "Lambo", LocalDate.of(2022, 8, 29), LocalDate.of(2022, 10, 12));

    }
}