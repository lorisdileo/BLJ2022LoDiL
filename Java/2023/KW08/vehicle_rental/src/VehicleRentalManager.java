import Exceptions.DenylistedPersonException;
import Exceptions.LeaseLengthCollisionException;
import Exceptions.MinorAgeException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class VehicleRentalManager {

    Scanner scan = new Scanner(System.in);
    ArrayList<Person> customerList = new ArrayList<>();
    ArrayList<Person> denyList = new ArrayList<>();
    ArrayList<Vehicle> vehicles = new ArrayList<>();
    ArrayList<Contract> contracts = new ArrayList<>();

    public void addPersonToDenylist(Person person) {
        denyList.add(person);
    }

    public void createContract(Person kunde, Vehicle fahrzeug, LocalDate startDatum, LocalDate endDatum, ArrayList<Person> denyList, ArrayList<Person> customerList, ArrayList<Contract> contracts) throws DenylistedPersonException, MinorAgeException, LeaseLengthCollisionException {
        Contract contract1 = new Contract(kunde, fahrzeug, startDatum, endDatum, denyList, customerList, contracts);
        contracts.add(contract1);
    }


    public void printContract(Contract contract) {
        System.out.println("------------------------------------------------------------------");
        System.out.println("Name: " + contract.getKunde().getFirstName() + " " + contract.getKunde().getLastName());
        System.out.println("Auto: " + contract.getFahrzeug().getMarke());
        System.out.println("Startdatum: " + contract.getStartDatum() + " Enddatum: " + contract.getEndDatum());
        System.out.println("Preis: " + contract.getFahrzeug().getPrice() + " pro Tag");
        System.out.println("------------------------------------------------------------------");
    }

    public Person createPersonInput() {
        System.out.print("Geben Sie den Vornamen ein: ");
        String firstName = scan.next();

        System.out.print("Geben Sie den Nachname ein: ");
        String lastName = scan.next();

        System.out.print("Geben Sie das Geburtsdatum ein: ");
        LocalDate birthYear = LocalDate.parse(scan.next());

        Person person = new Person(firstName, lastName, birthYear);

        customerList.add(person);
        return person;
    }

    public void addPersToDeny() {
        System.out.println("Geben Sie den Namen der Person ein:");

        for (Person pers : customerList) {
            System.out.println("- " + pers.getFirstName());
        }

        String userInputdeny = scan.next();

        Person denyPers = null;

        for (int i = 0; i < customerList.size(); i++) {
            if (Objects.equals(customerList.get(i).getFirstName(), userInputdeny)) {
                customerList.remove(denyPers);
            }
        }

        for (int i = 0; i < customerList.size(); i++) {
            if (Objects.equals(customerList.get(i).getFirstName(), userInputdeny)) {
                denyList.add(denyPers);
            }
        }
    }

    public void makeDeal() throws MinorAgeException, DenylistedPersonException, LeaseLengthCollisionException {
        try {
            System.out.println("Wer will ein Auto mieten?");
            for (int i = 0; i < customerList.size(); i++) {
                System.out.println("- " + customerList.get(i).getFirstName());
            }
            String kunde = scan.next();

            Person chosenPerson = null;

            for (int i = 0; i < customerList.size(); i++) {
                if (Objects.equals(customerList.get(i).getFirstName(), kunde)) {
                    chosenPerson = customerList.get(i);
                }
            }


            System.out.println("Welches Auto wollen Sie mieten?");
            for (int i = 0; i < vehicles.size(); i++) {
                System.out.println("- " + vehicles.get(i).getMarke());
            }

            Vehicle chosenOne = null;
            String fahr = scan.next();

            for (int i = 0; i < vehicles.size(); i++) {
                if (Objects.equals(vehicles.get(i).getMarke(), fahr)) {
                    chosenOne = vehicles.get(i);
                }
            }

            System.out.println("Für wie lange wollen Sie das Fahrzeug mieten?");
            System.out.println("Von?");
            LocalDate startDatum = LocalDate.parse(scan.next());
            System.out.println("Bis?");
            LocalDate endDatum = LocalDate.parse(scan.next());


            assert chosenPerson != null;
            Contract contract = new Contract(chosenPerson, chosenOne, startDatum, endDatum, denyList, customerList, contracts);

            printContract(contract);

            contracts.add(contract);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public ArrayList<Person> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Person> customerList) {
        this.customerList = customerList;
    }

    public ArrayList<Person> getDenyList() {
        return denyList;
    }

    public void setDenyList(ArrayList<Person> denyList) {
        this.denyList = denyList;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public ArrayList<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(ArrayList<Contract> contracts) {
        this.contracts = contracts;
    }
}
