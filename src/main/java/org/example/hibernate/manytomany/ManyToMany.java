package org.example.hibernate.manytomany;

import org.example.hibernate.onetoone.Answer;
import org.example.hibernate.onetoone.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class ManyToMany {
    public static void main(String[] args) {



        Configuration configuration = new Configuration();
        configuration.configure("hibernet.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Project p1 = new Project();
        Project p2 = new Project();

        e1.setId(1);
        e1.setName("sabbir");
        e2.setId(2);
        e2.setName("Irfan");
        p1.setId(11);
        p1.setName("springboot project:: GOVT");
        p2.setName("bash project:: GOVT");
        p2.setId(22);

        List<Employee> employees = new ArrayList<>();
        List<Project> projects = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        projects.add(p2);
        projects.add(p1);
        e1.setProjects(projects);
        e2.setProjects(projects);
        p1.setEmployees(employees);
        p2.setEmployees(employees);



        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(e1);
        session.save(e2);
        session.save(p1);
        session.save(p2);


        tx.commit();




        sessionFactory.close();
    }
}
