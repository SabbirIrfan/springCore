package org.example.autowire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context =  new ClassPathXmlApplicationContext("autowireConfig.xml");

        Employee employee1 = context.getBean("employee",Employee.class);
        System.out.println("Address2 bean hashcode >> " +employee1.getAddress().hashCode());
        System.out.println("Employee1 bean hashcode >> " +employee1.hashCode());
        Employee employee2 = context.getBean("employee",Employee.class);

        System.out.println("Address2 bean hashcode >> " +employee2.getAddress().hashCode());
        System.out.println("Employee2 bean hashcode >> " +employee2.hashCode());
    }
}
