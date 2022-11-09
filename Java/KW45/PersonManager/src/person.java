public class person {
    private String name;
    private String favoriteColor;

    public person(String name) {
        this.name = name;
    }

    public void presentYourself() {
        System.out.println("Hallo, ich bin " + name + " und meine Lieblingsfarbe ist " + favoriteColor);
    }

    public String getName() {
        return name;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public  void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }
}
