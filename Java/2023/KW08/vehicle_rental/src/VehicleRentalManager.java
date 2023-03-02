import Exceptions.DenylistedPersonException;
import Exceptions.LeaseLengthCollisionException;
import Exceptions.MinorAgeException;

import java.time.LocalDate;
import java.util.ArrayList;

public class VehicleRentalManager {

    ArrayList<Person> customerList = new ArrayList<>();
    ArrayList<Person> denyList = new ArrayList<>();
    ArrayList<Vehicle> vehicles = new ArrayList<>();
    ArrayList<Contract> contracts = new ArrayList<>();

    public void addPersonToDenylist(Person person){
        denyList.add(person);
    }

    public void createContract(Person kunde, Vehicle fahrzeug, LocalDate startDatum, LocalDate endDatum, ArrayList<Person> denyList, ArrayList<Person> customerList, ArrayList<Contract> contracts) throws DenylistedPersonException, MinorAgeException, LeaseLengthCollisionException {
        Contract contract1 = new Contract(kunde,  fahrzeug,  startDatum,  endDatum, denyList, customerList, contracts);
        contracts.add(contract1);
    }


    public void printContract(Contract contract){
        System.out.println("------------------------------------------------------------------");
        System.out.println("Name: " + contract.getKunde().getFirstName() + " " + contract.getKunde().getLastName());
        System.out.println("Auto: " + contract.getFahrzeug().getMarke());
        System.out.println("Startdatum: " + contract.getStartDatum() + " Enddatum: " + contract.getEndDatum());
        System.out.println("Preis: " + contract.getFahrzeug().getPrice() + " pro Stunde");
        System.out.println("------------------------------------------------------------------");
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
