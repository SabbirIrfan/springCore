package org.example.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int id;
    private String name;


    private String grp;

    public Student() {
        super();
    }

    public Student(int id, String name, String grp) {
        this.id = id;
        this.name = name;
        this.grp = grp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getgrp() {
        return grp;
    }

    public void setgrp(String grp) {
        this.grp = grp;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", grp='" + this.grp + '\'' +
                '}';
    }

}
