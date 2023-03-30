package org.example;

import java.util.HashSet;
import java.util.Set;

public class TypeConverter {

    public static short convertStringToShort(String toConvert) throws IllegalArgumentException {
        //todo: implement
        return 0;
    }

    public static double convertStringToDouble(String toConvert) throws IllegalArgumentException {

        toConvert = toConvert.replaceAll("[_']", "");
        toConvert = toConvert.replace(',', '.');

        try{
            double d = Double.parseDouble(toConvert);
            System.out.println(d);
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }

        return 0;
    }

    public static char[] StringToCharArray(String toConvert) throws IllegalArgumentException {
        try {
            char[] toCharArray = toConvert.toCharArray();
            for (char ch : toCharArray) {
                char toConvertLower = Character.toLowerCase(ch);
                if (ch == '-') {
                    throw new IllegalArgumentException();
                }
                System.out.print(toConvertLower);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        System.out.print("\n");
        return new char[]{};
    }

    public static Long convertStringToLong(String toConvert) throws IllegalArgumentException {
        toConvert = toConvert.replaceAll("[_']", "");
        toConvert = toConvert.replace(',', '.');

        try {
            for (char ch: toConvert.toCharArray()) {
                if (ch + 1 == '-') {
                    throw new IllegalArgumentException();
                }
            }
            Long l = Long.parseLong(toConvert);
            System.out.println(l);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        return 0L;
    }

    public static Set<Character> StringToCharSet(String toConvert){
        Set<Character> charSet = new HashSet<Character>();
        try {
            String cleanedString = toConvert.toLowerCase();

            for (int i = 0; i < cleanedString.length(); i++) {
                char currentChar = cleanedString.charAt(i);
                if (charSet.contains(currentChar)) {
                    throw new IllegalArgumentException();
                } else if (i == 1 || cleanedString.length() -1 == i) {
                    if (currentChar == '-'){
                        throw new IllegalArgumentException();
                    }
                }
                charSet.add(currentChar);
            }
            System.out.println(cleanedString);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        return new HashSet<Character>();
    }
}
