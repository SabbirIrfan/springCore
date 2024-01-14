package org.example.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class fetchDemo {

    public static void main(String[] args) {
        System.out.println("hello hibernate fetching >> get() or load() ??");

        Configuration configuration = new Configuration();
        configuration.configure("hibernet.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();


        Student student = (Student) session.get(Student.class,10);
        System.out.println(student);
        session.close();
        sessionFactory.close();

    }
}
