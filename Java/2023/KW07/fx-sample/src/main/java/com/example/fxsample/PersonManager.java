package com.example.fxsample;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {
    public ArrayList<Person> people = new ArrayList<>();

    private int index = -1;

    public void addPerson(String prename, String name, int age) {
        people.add(new Person(prename, name, age));
        index++;
    }

    public void removePerson(){
        getPeople().remove(index);
        System.out.println(people);
        index = people.size()-1;
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

    public String[] previPerson(int plusminus){
        index += plusminus;
        Person person = people.get(index);
        String preName = person.getPreName();
        String name = person.getName();
        String age = String.valueOf(person.getAge());
        return new String[] {preName, name, String.valueOf(age)};
    }

    public String[] nextPerson(int plusminus){
        index += plusminus;
        Person person = people.get(index);
        String preName = person.getPreName();
        String name = person.getName();
        String age = String.valueOf(person.getAge());
        return new String[] {preName, name, String.valueOf(age)};
    }
}
