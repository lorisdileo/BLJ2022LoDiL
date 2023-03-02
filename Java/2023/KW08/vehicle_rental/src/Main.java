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
        Person p3M = new Person("Luis", "Kueng", LocalDate.of(2010, 5,15));
        Vehicle bug = new Vehicle("Bugatti", "Bronze", 2000, 1000);
        Vehicle lambo = new Vehicle("Lamborghini", "Blau", 1100, 200);
        Vehicle rolls = new Vehicle("Rolls Royce", "Weiss", 550, 400);

        VehicleRentalManager vh = new VehicleRentalManager();

        vh.denyList.add(p2L);

        vh.vehicles.add(bug);
        vh.vehicles.add(lambo);
        vh.vehicles.add(rolls);

        /*System.out.println("Was möchten Sie machen?");
        System.out.println("[0] - Neue Person erstellen");
        System.out.println("[1] - Fahrzeutg mieten");
        System.out.println("[2] - Jemand zu der Verbotsliste hinzufügen");
        Integer userinput = scan.nextInt();

        switch (userinput){
            case 0: {
                vh.createPersonInput();
            }

            case 1: {
                for (Vehicle vc : vh.vehicles) {
                    System.out.println(vc);
                }
            }

            case 2: {
                for (Person pers : vh.customerList) {
                    System.out.println(pers);
                }
            }
        }*/


        try {
            vh.createContract(p1, lambo, LocalDate.of(2022, 8, 29), LocalDate.of(2022, 10, 12), vh.getDenyList(), vh.getCustomerList(), vh.getContracts());
            //vh.createContract(p2L, rolls, LocalDate.of(2022, 3, 21), LocalDate.of(2022, 11, 15), vh.getDenyList(), vh.getCustomerList(), vh.getContracts());
            vh.createContract(p3M, bug, LocalDate.of(2021, 3, 21), LocalDate.of(2021, 11, 15), vh.getDenyList(), vh.getCustomerList(), vh.getContracts());
        }catch (CException e){
            System.out.println(e.getMessage());;
        }


        for (Contract con: vh.getContracts()) {
            vh.printContract(con);
        }
    }
}