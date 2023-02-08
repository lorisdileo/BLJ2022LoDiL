import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = 0;
        int month = 0;
        boolean is_running = true;

        while(is_running)  {
            System.out.println("Gib bitte einen Jahr ein: ");
            year = scan.nextInt();

            System.out.println("Gib bitte einen Moant ein:");
            month = scan.nextInt();
            
            is_running = false;
        }
        
        boolean result = isLeapYear(year);
        printDateInfo(month, year);
    }

    public static boolean isLeapYear(int year){
        if (year % 4 == 0) {
            if(year %100 == 0){
                if(year %400 == 0){
                    return true;
                } else{
                    return false;
                }
            } else{
                return false;
            }
        }
        else {
            return false;
        }
    }
    static int daysInMonth(int month, int year){
        if(month == 1){
            return 31;
        }else if (month == 2 && isLeapYear(year)){
            return 29;
        }else if (month == 2 && !isLeapYear(year)){
            return 28;
        }else if(month == 3){
            return 31;
        }else if(month == 4){
            return 30;
        }else if(month == 5){
            return 31;
        }else if(month == 6){
            return 30;
        }else if(month == 7){
            return 31;
        }else if(month == 8){
            return 31;
        }else if(month == 9){
            return 30;
        }else if(month == 10){
            return 31;
        }else if(month == 11){
            return 30;
        }else if(month == 12){
            return 31;
        }
        return month;
    }
    static void printDateInfo(int month, int year){
        int days = daysInMonth(month, year);

        System.out.println("Der Monat " + month + " hat im Jahr " + year + " " + days + " Tage. \n");

        System.out.print("Das Yahr " + year + " ist ");
        if(!isLeapYear(year)){
            System.out.print(" kein ");
        }else{
            System.out.print("ein ");
        }
        System.out.print("Schaltjahr \n");
    }
}