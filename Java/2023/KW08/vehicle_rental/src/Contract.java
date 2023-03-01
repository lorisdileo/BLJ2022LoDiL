import java.time.LocalDate;
import java.util.ArrayList;

public class Contract {
    private Vehicle fahrzeug;
    private Person kunde;
    private LocalDate startDatum;
    private LocalDate endDatum;

    public Contract
            (Person kunde, Vehicle fahrzeug, LocalDate startDatum, LocalDate endDatum, ArrayList<Person> denyList, ArrayList<Person> customerList, ArrayList<Contract> contracts){


        //exceptions

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
