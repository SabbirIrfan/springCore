package org.example.springjdbc;

import org.example.springjdbc.dao.PersonDao;
import org.example.springjdbc.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        System.out.println("spring jdbc started");

        ApplicationContext context = new ClassPathXmlApplicationContext("springjdbc.xml");

        PersonDao personDao = context.getBean("personDao", PersonDao.class);

        Person person = new Person(6,"Tanvir");


        System.out.println("number of record inserted == " + personDao.insert(person));

    }
}
