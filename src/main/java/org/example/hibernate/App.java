package org.example.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.stat.Statistics;

public class App {
    public static void main(String[] args) {
        System.out.println("hello hibernate");

        Configuration configuration = new Configuration();
        configuration.configure("hibernet.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        sessionFactory.inSession((x)->{
//            Statistics stat = sessionFactory.getStatistics();
//            System.out.println(stat);
//        });
//
////        System.out.println(sessionFactory.getCurrentSession());
//        sessionFactory.close();
//        System.out.println(sessionFactory.isClosed());

        //Creating student

        Student student = new Student(2,"RESERVED WORDS","SHOULD NOT BE IN THE COLUMN NAME");

        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(student);

        tx.commit();

    }
}
