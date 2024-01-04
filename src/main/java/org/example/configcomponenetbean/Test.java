package org.example.configcomponenetbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.example.configcomponenetbean");

        Student student = context.getBean("student",Student.class);

        System.out.println(student.toString());


    }
}
