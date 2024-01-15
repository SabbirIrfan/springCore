/**/package org.example.hibernate.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class OneToOne {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure("hibernet.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();



        Answer answer1 = new Answer(1,"its a programming language");
        Answer answer2 = new Answer(2,"pore bolbo");
        List<Answer> answers = new ArrayList<>();
        answers.add(answer1);
        answers.add(answer2);

        //        Question question1 = new Question(1212,"what is java",answers);
        Question question = new Question();
        question.setAnswers(answers);
        question.setQuestion("what is java");
        question.setQuestionId(1212);
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
//
        answer1.setQuestion(question);
        answer2.setQuestion(question);
        session.save(answer1);
        session.save(answer2);
        session.save(question);


        Question q = (Question) session.get(Question.class,1212);
        System.out.println(q.getAnswers());

        for(Answer a: q.getAnswers()){
            System.out.println(a.getAnswer());
        }
//
        tx.commit();




        sessionFactory.close();
    }
}
