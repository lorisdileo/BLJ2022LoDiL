import Exceptions.DenylistedPersonException;
import Exceptions.MinorAgeException;
import Exceptions.LeaseLengthCollisionException;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Contract extends Exception {
    private Vehicle fahrzeug;
    private Person kunde;
    private LocalDate startDatum;
    private LocalDate endDatum;

    public Contract(Person kunde, Vehicle fahrzeug, LocalDate startDatum, LocalDate endDatum, ArrayList<Person> denyList, ArrayList<Person> customerList, ArrayList<Contract> contracts) throws DenylistedPersonException, MinorAgeException, LeaseLengthCollisionException {
        if (Period.between(kunde.getBirthYear(), LocalDate.now()).getYears() < 18 ){
            throw new MinorAgeException();
        }

        for (Contract ct : contracts) {
            if (startDatum.isBefore(ct.endDatum) && endDatum.isAfter(ct.startDatum) && ct.getFahrzeug() == fahrzeug || endDatum.isBefore(startDatum)){
                throw new LeaseLengthCollisionException();
            }
        }

        for (Person person : denyList){
            if (person.getLastName().equals(kunde.getLastName())){
                throw new DenylistedPersonException();
            }
        }
        this.fahrzeug = fahrzeug;
        this.kunde = kunde;
        this.startDatum = startDatum;
        this.endDatum = endDatum;
    }

    public Vehicle getFahrzeug() {
        return fahrzeug;
    }

    public void setFahrzeug(Vehicle fahrzeug) {
        this.fahrzeug = fahrzeug;
    }

    public Person getKunde() {
        return kunde;
    }

    public void setKunde(Person kunde) {
        this.kunde = kunde;
    }

    public LocalDate getStartDatum() {
        return startDatum;
    }

    public void setStartDatum(LocalDate startDatum) {
        this.startDatum = startDatum;
    }

    public LocalDate getEndDatum() {
        return endDatum;
    }

    public void setEndDatum(LocalDate endDatum) {
        this.endDatum = endDatum;
    }
}
