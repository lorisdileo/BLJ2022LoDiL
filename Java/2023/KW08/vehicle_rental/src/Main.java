import java.util.Scanner;
import Exceptions.CException;
import Exceptions.DenylistedPersonException;
import Exceptions.LeaseLengthCollisionException;
import Exceptions.MinorAgeException;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws MinorAgeException, DenylistedPersonException, LeaseLengthCollisionException {
        Scanner scan = new Scanner(System.in);
        Person p1 = new Person("Dominic", "Heule", LocalDate.of(2001, 6,12));
        Person p2L = new Person("Sairam", "Kumar", LocalDate.of(1915, 12,1));
        Vehicle lambo = new Vehicle("Lamborghini", "Blau", 1100, 200);
        Vehicle rolls = new Vehicle("Rolls Royce", "Weiss", 550, 400);

        VehicleRentalManager vh = new VehicleRentalManager();

        /*System.out.println("Was möchten Sie machen?");
        System.out.println("[0] - Neue Person erstellen");
        System.out.println("[1] - Fahrzeutg mieten");
        System.out.println("[2] - Jemand zu der Schwarzenliste hinzufügen");
        Integer userinput = scan.nextInt();

        switch (userinput){
            case -> 0 {

            }
        }*/


        vh.addPersonToDenylist(p2L);


        try {
            vh.createContract(p1, lambo, LocalDate.of(2022, 8, 29), LocalDate.of(2022, 10, 12), vh.getDenyList(), vh.getCustomerList(), vh.getContracts());
            vh.createContract(p2L, rolls, LocalDate.of(2022, 3, 21), LocalDate.of(2022, 11, 15), vh.getDenyList(), vh.getCustomerList(), vh.getContracts());
        }catch (CException e){
            System.out.println(e.getMessage());;
        }


        for (Contract con: vh.getContracts()) {
            vh.printContract(con);
        }
    }
}