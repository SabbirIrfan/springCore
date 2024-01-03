package org.example.autowire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context =  new ClassPathXmlApplicationContext("autowireConfig.xml");

        Employee employee1 = context.getBean("employee",Employee.class);

        System.out.println(employee1);

    }
}
