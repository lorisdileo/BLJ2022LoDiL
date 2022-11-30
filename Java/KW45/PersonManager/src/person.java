public class Person {
    private String vorName;

    private String nachName;
    private String favoriteColor;

    public Person( ) {

    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public Person(String nachName) {
        this.nachName = nachName;
    }

    public void presentYourself() {
        System.out.println("Hallo, ich bin " + vorName + " " + nachName + " und meine Lieblingsfarbe ist " + favoriteColor);
    }

    public String getVorName() {
        return vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public  void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }
}
