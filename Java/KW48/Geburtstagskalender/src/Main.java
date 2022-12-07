import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person[] persArr = new Person[40];
        System.out.println("2022 haben Geburtstag im");
        initPersonArray(persArr);
        Person.dayRow(persArr);
        Person.printBd(persArr);
    }

    public static void initPersonArray(Person[] persArr) {
        int i = 0;
        persArr[i++] = new Person(2007, 5, 1, "Marko");
        persArr[i++] = new Person(2006, 11, 23, "Dylan");
        persArr[i++] = new Person(2006, 7, 23, "Samuel");
        persArr[i++] = new Person(2006, 5, 21, "Luis");
        persArr[i++] = new Person(2001, 12, 19, "Sairam");
        persArr[i++] = new Person(2002, 11, 13, "Tsering Lhamo");
        persArr[i++] = new Person(2004, 9, 27, "Nikola");
        persArr[i++] = new Person(2007, 1, 18, "Noah");
        persArr[i++] = new Person(2007, 1, 25, "Aurora");
        persArr[i++] = new Person(1999, 12, 12, "Jasmin");
        persArr[i++] = new Person(2006, 11, 8, "Fatima");
        persArr[i++] = new Person(2002, 6, 18, "Sheung Tsung");
        persArr[i++] = new Person(2006, 1, 23, "Timofey");
        persArr[i++] = new Person(2007, 3, 7, "Ruben");
        persArr[i++] = new Person(2006, 12, 26, "Aabish");
        persArr[i++] = new Person(2005, 7, 23, "Ömer Burak");
        persArr[i++] = new Person(2006, 5, 23, "Emma");
        persArr[i++] = new Person(2007, 7, 12, "Oscar");
        persArr[i++] = new Person(2004, 10, 15, "Jessica");
        persArr[i++] = new Person(2006, 11, 13, "Nikhil");
        persArr[i++] = new Person(2006, 5, 7, "Elmar");
        persArr[i++] = new Person(2006, 5, 22, "Henri");
        persArr[i++] = new Person(2005, 5, 21, "Virginia");
        persArr[i++] = new Person(2005, 8, 16, "Yan");
        persArr[i++] = new Person(2007, 4, 25, "Ilija");
        persArr[i++] = new Person(2007, 4, 8, "Valentin");
        persArr[i++] = new Person(2006, 7, 25, "Loris");
        persArr[i++] = new Person(2007, 6, 1, "Dominic");
        persArr[i++] = new Person(2006, 10, 20, "Lorena");
        persArr[i++] = new Person(2005, 3, 10, "Edgar");
        persArr[i++] = new Person(2006, 12, 16, "Richard");
        persArr[i++] = new Person(2003, 1, 1, "Saad");
        persArr[i++] = new Person(2004, 2, 26, "Filip");
        persArr[i++] = new Person(2004, 5, 4, "Duy Minh");
        persArr[i++] = new Person(2006, 3, 7, "Timothy");
        persArr[i++] = new Person(2006, 4, 7, "Jamie");
        persArr[i++] = new Person(2006, 3, 18, "Jasmin");
        persArr[i++] = new Person(2002, 4, 25, "Sharujah");
        persArr[i++] = new Person(2005, 3, 4, "Darko");
        persArr[i++] = new Person(2006, 4, 7, "Dina");
    }
}