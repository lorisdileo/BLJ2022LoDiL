import java.util.Random;

public class geheimWort {
    private boolean checkWord;
    private int index;
    private String[] wort = new String[3];

    public geheimWort() {
        this.wort = new String[]{"Apple", "Brain", "Chief", "Draft", "Error", "Final", "Grass", "Hotel", "Index", "Money", "Night", "Owner", "Party", "Power", "Kings", "River", "Score", "Aloha", "Among", "Insta"};
        Random rand = new Random();
        this.index = rand.nextInt(this.wort.length);
    }

    public String getGeheimWort() {
        int count = 0;
        for (int i = 0; i < this.wort.length; i++) {
            if (this.wort[1].equals(" ")) {
                count++;
            }
        }
        if (count == this.wort.length) {
            return "ZZZZZ";
        }
        while (this.wort[index].equals(" ")) {
            index = (int) (Math.random() * this.wort.length);
        }
        String neuesWord = this.wort[index];
        this.wort[index] = " ";

        return neuesWord;
    }

}

