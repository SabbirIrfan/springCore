package org.example.autowire;

public class Address {
    private String golli;
    private String shohor;

    public Address() {
        super();
    }

    public Address(String golli, String shohor) {
        this.golli = golli;
        this.shohor = shohor;
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
