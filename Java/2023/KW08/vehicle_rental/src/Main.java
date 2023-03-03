import java.util.Scanner;

import Exceptions.CException;
import Exceptions.DenylistedPersonException;
import Exceptions.LeaseLengthCollisionException;
import Exceptions.MinorAgeException;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws MinorAgeException, DenylistedPersonException, LeaseLengthCollisionException {
        Scanner scan = new Scanner(System.in);
        Vehicle bug = new Vehicle("Bugatti", "Bronze", 2000, 1000);
        Vehicle lambo = new Vehicle("Lamborghini", "Blau", 1100, 200);
        Vehicle paga = new Vehicle("Pagani", "Weiss", 2500, 2000);

        VehicleRentalManager vh = new VehicleRentalManager();

        boolean isRunning = true;

        vh.vehicles.add(bug);
        vh.vehicles.add(lambo);
        vh.vehicles.add(paga);

        System.out.println("*******************************************************");
        System.out.println("                     Willkommen                        ");
        System.out.println("*******************************************************");

        while (isRunning) {
            System.out.println();
            System.out.println("*******************************************************");
            System.out.println("Was möchten Sie machen?");
            System.out.println("[1] - Neue Person erstellen");
            System.out.println("[2] - Fahrzeug mieten");
            System.out.println("[3] - Jemand zu der Verbotsliste hinzufügen");
            System.out.println("[0] - Programm beenden");
            System.out.println("*******************************************************");
            Integer userinput = scan.nextInt();

            switch (userinput) {
                case 0: {
                    System.out.println("Danke das Sie mein Programm benutzt haben.");
                    isRunning = false;
                    break;
                }

                case 1: {
                    vh.createPersonInput();
                    break;
                }

                case 2: {
                    vh.makeDeal();
                    break;
                }

                case 3: {
                    vh.addPersToDeny();
                    break;
                }
            }
        }
    }
}