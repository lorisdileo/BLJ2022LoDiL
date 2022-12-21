import java.time.LocalDate;
import java.util.ArrayList;

public class Person {
    private int year;
    private int month;
    private int day;
    private String name;
    private int age;
    public Person(int year, int month, int day, String name) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.name = name;
        this.age = LocalDate.now().minusYears(year).minusMonths(month-1).minusDays(day).getYear();
    }

    public static boolean dayRow(ArrayList<Person> persArr){
        Person swap;
        int x = persArr.size();
        for (int i = 0; i < x; i++){
            for(int j = 1; j < (x - i); j++){
                if(persArr.get(j - 1).getDay() > persArr.get(j).getDay()){
                    swap = persArr.get(j - 1);
                    persArr.set(j - 1,  persArr.get(j));
                    persArr.set(j, swap);
                }
            }
        }
        return false;
    }

    public static void printBd(ArrayList<Person> persArr){
        String[] month = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
        for (int i = 0; i < month.length; i++) {
            System.out.println(month[i]);
            for (Person person : persArr){
                if (person.getMonth() == i + 1){
                    System.out.println(person.getDay() + ". " + person.getName() + " (" + person.getAge() + ")");
                }
            }
            System.out.println();
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
