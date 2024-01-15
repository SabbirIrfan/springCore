package org.example.hibernate.manytomany;

import jakarta.persistence.*;
import jakarta.persistence.ManyToMany;

import java.util.List;
@Entity
public class Project {

    @Id
    private int id;

    private String name;
    @ManyToMany
    @JoinTable(name = "employee_project" , joinColumns = {@JoinColumn( name = "pid") } , inverseJoinColumns = { @JoinColumn (name =  "eid")})
    private List<Employee> employees;

    public Project() {
    }

    public Project(int id, String name, List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.employees = employees;
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

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
