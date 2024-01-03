package org.example.steriotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component("component")
@Scope("prototype")
public class Person {

    @Value("Sabbir")
    private String name;
    @Value("22")
    private int id;
   Certi ct;

    public Person() {
    }

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Person(String name, int id, Certi ct) {
        this.name = name;
        this.id = id;
        this.ct = ct;
    }

    @Autowired
    public Person(Certi ct) {
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
