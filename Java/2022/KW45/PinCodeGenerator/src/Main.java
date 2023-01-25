public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 9999; i++) {

            if (i < 10) {
                System.out.println("000" + i);
            }

            if (i > 10 && i < 100) {
                System.out.println("00" + i);
            }

            if (i > 100 && i < 1000) {
                System.out.println("0" + i);
            }

            if (i > 1000 && i <= 9999) {
                System.out.println(i);
            }
        }
    }
}