package org.example.steriotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Certi {
    @Value("BSc in CSE")
    private String name;
    public   Certi(){
        super();
    }
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
