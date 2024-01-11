package org.example.constructorinjeciton;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person {

    private String name;
    private int id;

    int x ;
    Certi cer;

    private static Person person = new Person(55);

//    public Person() {
//        super();
//    }
    public static Person nothing(){
        return person;
    }
    public void setCerti(Certi certi) {
        this.cer = certi;
    }

    public Person(int id) {
        this.id = id;
    }

    public Person(String name, int id, Certi cer) {
        this.id = id;
        this.cer = cer;
        this.name = name;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", ct=" + cer +
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
