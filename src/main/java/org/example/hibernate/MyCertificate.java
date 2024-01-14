package org.example.hibernate;

import jakarta.persistence.Embeddable;

@Embeddable
public class MyCertificate {

    private String degree;
    private String message;

    public MyCertificate() {
    }

    public MyCertificate(String degree, String message) {
        this.degree = degree;
        this.message = message;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
