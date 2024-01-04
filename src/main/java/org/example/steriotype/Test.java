package org.example.steriotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("steriotypeConfig.xml");
        Person p = context.getBean("component", Person.class);

        System.out.println(p);

        Expression e = p.sPeL("#{22*2}");

        System.out.println(e.getValue());
    }
}
