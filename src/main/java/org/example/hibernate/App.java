package org.example.hibernate;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.stat.Statistics;

public class App {
    public static void main(String[] args) {
        System.out.println("hello hibernate");

        Configuration configuration = new Configuration();
        configuration.configure("hibernet.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        sessionFactory.inSession((x)->{
            Statistics stat = sessionFactory.getStatistics();
            System.out.println(stat);
        });

//        System.out.println(sessionFactory.getCurrentSession());
        sessionFactory.close();
        System.out.println(sessionFactory.isClosed());

    }
}
