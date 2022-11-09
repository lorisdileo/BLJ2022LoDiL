public class Main {
    public static void main(String[] args) {

       person Sairam = new person("Sairam");
       person Jessica = new person("Jessica");

       Sairam.setFavoriteColor("blau");
       Jessica.setFavoriteColor("grün");

        System.out.println("***********************");
        Sairam.presentYourself();
        System.out.println("***********************");
        Jessica.presentYourself();
        System.out.println("***********************");
    }
}