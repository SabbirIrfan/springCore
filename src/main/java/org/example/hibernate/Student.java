package org.example.hibernate;

import com.mysql.cj.protocol.ColumnDefinition;
import jakarta.persistence.*;
import org.example.steriotype.Certi;

import java.security.cert.Certificate;

@Entity
public class Student {

    @Id
    private int id;
    private String name;

    private MyCertificate certificate;

    public Student(int id, String name, MyCertificate certificate, String grp) {
        this.id = id;
        this.name = name;
        this.certificate = certificate;
        this.grp = grp;
    }

    public MyCertificate getCertificate() {
        return certificate;
    }

    public void setCertificate(MyCertificate certificate) {
        this.certificate = certificate;
    }

    @Lob
    @Column( columnDefinition="MEDIUMBLOB")
    private byte[] image;

    private String grp;

    public Student() {
        super();
    }
    public Student(int id, String name, byte[] image, String grp) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.grp = grp;
    }

    public Student(String name, String grp) {
        this.name = name;
        this.grp = grp;
    }

    public Student(int id, String name, String grp) {
        this.id = id;
        this.name = name;
        this.grp = grp;
    }

    public int getId() {
        return id;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getGrp() {
        return grp;
    }

    public void setGrp(String grp) {
        this.grp = grp;
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
