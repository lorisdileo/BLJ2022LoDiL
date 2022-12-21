public class wordl {
    private String ID;
    private int gespielteSpiele;
    private int win;
    private int[]  anzahlVersuche = new int[6];

    public wordl(String newID) {
        this.ID = newID;
        this.gespielteSpiele = 0;
        this.win = 0;
        this.anzahlVersuche = new int[] {0, 0, 0, 0, 0, 0};
    }
    public String getID() {
        return ID;
    }

    public int getGespielteSpiele() {
        return gespielteSpiele;
    }

    public void setGespielteSpiele() {
        gespielteSpiele++;
    }

    public int getWin() {
        return win;
    }

    public void setWin() {
        win++;
    }

    public String getAnzahlVersuche() {
        String guesses = "\n 1 Anzahl Versuche gebraucht: " + anzahlVersuche[0] + "\n 2 Anzahl Versuche gebraucht: " + anzahlVersuche[1] + "\n 3 Anzahl Versuche gebraucht: " + anzahlVersuche[2] + "\n 4 Anzahl Versuche gebraucht: " + anzahlVersuche[3] + "\n 5 Anzahl Versuche gebraucht: " + anzahlVersuche[4] + "\n 6 Anzahl Versuche gebraucht: " + anzahlVersuche[5];
        return guesses;
    }

    public void setAnzahlVersuche(int newAnzahlVersuche) {
        anzahlVersuche[(newAnzahlVersuche - 1)] = anzahlVersuche[newAnzahlVersuche - 1] + 1;
    }

    public void printPlayerStats(){

    }

    public String zuString() {
        return "Spiele gespielt: " + gespielteSpiele + "\nAnzahl Gewinne: " + win;
    }

}
