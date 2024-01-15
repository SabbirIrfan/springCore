package org.example.autowire;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("address1" )
@Scope("prototype")
public class Address {
    private String golli;
    private String shohor;

    public Address() {

        super();
        System.out.println("Adderss default constructor has been called");

    }

    public Address(String golli, String shohor) {
        this.golli = golli;
        this.shohor = shohor;
        System.out.println("Adderss 1");

    }

    public String getGolli() {
        return golli;
    }

    public void setGolli(String golli) {
        this.golli = golli;
    }

    public String getShohor() {
        return shohor;
    }

    public void setShohor(String shohor) {
        this.shohor = shohor;
    }

    @Override
    public String toString() {
        return this.golli + this.shohor;
    }
}
