package org.example;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        TypeConverter tp = new TypeConverter();

        TypeConverter.convertStringToDouble("-7'77,989");
        TypeConverter.StringToCharArray("HJKHdjkfgh");
        TypeConverter.convertStringToLong("-3456");
        TypeConverter.StringToCharSet("do-nqwerkl");
    }
}