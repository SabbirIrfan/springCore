package org.example.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
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
//        try{

            FileInputStream fis = new FileInputStream("src/main/resources/HH.mp4");
            byte[] data = new byte[fis.available()];
            fis.read(data);

            Student student = new Student(10 ,"RESERVED WORDS",data,"SHOULD NOT BE IN THE COLUMN NAME");

            Session session = sessionFactory.openSession();
            Transaction tx = session.beginTransaction();

            session.persist(student);

            tx.commit();

//        }catch (Exception e){
//            System.out.println("Error" + e.getMessage());
//        }


    }
}
