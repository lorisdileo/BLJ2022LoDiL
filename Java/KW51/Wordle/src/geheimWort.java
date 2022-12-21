public class geheimWort {
    private boolean checkWord;
    private int index;
    private String[] wort = new String[3];

    public geheimWort() {
        wort = new String[]{"Apple", "Brain", "Chief", "Draft", "Error", "Final", "Grass", "Hotel", "Index", "Money", "Night", "Owner", "Party", "Power", "Kings", "River", "Score", "Aloha", "Among", "Insta"};
        index = (int) (Math.random() * wort.length);
    }

    public String getGeheimWort() {
        int count = 0;
        for (int i = 0; i < wort.length; i++) {
            if (wort[1].equals(" ")) {
                count++;
            }
        }
        if (count == wort.length) {
            return "ZZZZZ";
        }
        while (wort[index].equals(" ")) {
            index = (int) (Math.random() * wort.length);
        }
        String neuesWord = wort[index];
        wort[index] = " ";

        return neuesWord;
    }

}

