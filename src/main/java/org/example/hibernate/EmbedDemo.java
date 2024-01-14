package org.example.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbedDemo {
    public static void main(String[] args) {
        System.out.println("hello hibernate fetching >> EMBEDED??");

        Configuration configuration = new Configuration();
        configuration.configure("hibernet.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();


        MyCertificate myCertificate0 = new MyCertificate("ssc","dam nai vai");
        MyCertificate myCertificate1 = new MyCertificate("hsc","kichu dam ache");

            Student student0 = new Student(0,"Sabbir",myCertificate0,"science");
            Student student1 = new Student(1,"irfan",myCertificate1,"science");



        session.persist(student0);
        session.persist(student1);
        Transaction tx = session.beginTransaction();

        tx.commit();

        Student student = (Student) session.get(Student.class,1);
        System.out.println(student);
        session.close();
        sessionFactory.close();
    }
}
