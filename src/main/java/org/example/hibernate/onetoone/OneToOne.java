package org.example.hibernate.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOne {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure("hibernet.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Answer answer1 = new Answer(1,"its a programming language");
        Answer answer2 = new Answer(1,"pore bolbo");
        Question question1 = new Question(1212,"what is java",answer1);
        Question question2 = new Question(1213,"what is hibernate",answer2);
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(question1);
        session.save(question2);

        tx.commit();




        sessionFactory.close();
    }
}
