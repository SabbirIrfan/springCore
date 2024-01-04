package org.example.configcomponenetbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("student")
@ComponentScan(basePackages = "org.example.configcomponenetbean")
public class Student {
    @Value("#{new org.example.configcomponenetbean.Apple()}")
    Apple apple;
    @Value("sabbir")
    private String name;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int x){
        System.out.println("student object is created with "+ x);
    }
    public Student(Apple apple,String name) {
        System.out.println("i am "+ name + " and got my apple ");
        this.name = name;
        this.apple = apple;

    }
    @Override
    public String toString() {
        return "Student{}" + this.getClass().getName();
    }
}
