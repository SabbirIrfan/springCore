package org.example.configcomponenetbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("org.example.configcomponenetbean") // not needed if the bean is used
public class configXML {

    @Bean
    public Apple getApple(){
        System.out.println("getting apple");
        return new Apple();
    }
    @Bean
    public Student getStudentObject(){
        String name = "irfan";
        System.out.println("letting apple to the student");
        return new Student(getApple(),name);
    }


}
