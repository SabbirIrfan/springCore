package org.example.steriotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("steriotypeConfig.xml");
        Person p = context.getBean("component", Person.class);

        System.out.println(p.hashCode());

        Person p2 = context.getBean("component", Person.class);

        System.out.println(p2.hashCode());
    }
}
