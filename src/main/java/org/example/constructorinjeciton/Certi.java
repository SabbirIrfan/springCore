package org.example.constructorinjeciton;

public class Certi {
    private String name;

    public Certi(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  this.name  ;
    }

    public void setName(String name) {
        this.name = name;
    }
}
