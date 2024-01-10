package org.example.springjdbc;

import org.example.springjdbc.config.ConfigBean;
import org.example.springjdbc.dao.PersonDao;
import org.example.springjdbc.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App {

    public static void main(String[] args) {
        System.out.println("spring jdbc started");
//
//        ApplicationContext context = new ClassPathXmlApplicationContext("springjdbc.xml");
//
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigBean.class);
        PersonDao personDao = context.getBean("personDao", PersonDao.class);
//
//        Person person = new Person(6,"Tanvir Irfan");
//
//
////        System.out.println("number of record inserted == " + personDao.insert(person));
//        System.out.println("number of record inserted == " + personDao.change(person));

//        Person p = personDao.getPerson(1);
        List<Person> personList = personDao.getAllPerson();
        for(Person p: personList){
            System.out.println( p.getId()+ " " + p.getName());
        }

    }
}
