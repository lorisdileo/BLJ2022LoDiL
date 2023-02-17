package com.example.fxsample;

public class Person {
    private String preName;

    private String name;
    private int age;

    public Person(String preName, String name, int age) {
        this.preName = preName;
        this.name = name;
        this.age = age;
    }

    public String getPreName() {
        return preName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
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


