package org.example.hibernate.hql;

import org.example.hibernate.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class HQL {

    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernet.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session s=  sessionFactory.openSession();


        //HQL

//        String query = "from Student";
//        Query q = s.createQuery(query);
//        List<Student> list = q.list();
////        System.out.println("out of student "+ list);
//
//        for(Student student: list){
//            System.out.println("in student");
//            System.out.println(student.getName());
//
//

        /// JOIN
        Query q3 = s.createQuery("select  q.question , q.questionId, a.question from Question as q inner join Answer as a");


        List<Object[]> list = q3.getResultList();
        System.out.println(list
        );
        for(Object[] row : list){
            System.out.println(Arrays.toString(row));
        }
        s.close();
        sessionFactory.close();




    }
}
