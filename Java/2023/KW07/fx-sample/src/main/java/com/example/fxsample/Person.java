package com.example.fxsample;

public class Person {
    private static String preName;

    private static String name;
    private static int age;

    public Person(String preName, String name, int age) {
        this.preName = preName;
        this.name = name;
        this.age = age;
    }

    public static String getPreName() {
        return preName;
    }

    public static String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }

    public void setPreName(String preName) {
        this.preName = preName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


