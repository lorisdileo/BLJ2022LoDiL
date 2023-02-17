package com.example.fxsample;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {
    public ArrayList<Person> people = new ArrayList<>();

    private int index = 0;

    public void addPerson(String prename, String name, int age) {
        people.add(new Person(prename, name, age));
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
