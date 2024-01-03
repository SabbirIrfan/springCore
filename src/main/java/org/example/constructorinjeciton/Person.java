package org.example.constructorinjeciton;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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
        @PostConstruct
        public void start(){
            System.out.println("starting person bean ");
        }
        @PreDestroy
        public void end(){
            System.out.println("destroying the person bean");
        }
}
