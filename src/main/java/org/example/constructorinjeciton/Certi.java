package org.example.constructorinjeciton;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Component

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
