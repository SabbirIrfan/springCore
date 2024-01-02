package org.example.constructorinjeciton;

public class Person {

    private String name;
    private int id;
    Certi ct;

    public Person(String name, int id, Certi ct) {
        this.name = name;
        this.id = id;
        this.ct = ct;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", ct=" + ct +
                '}';
    }
}
