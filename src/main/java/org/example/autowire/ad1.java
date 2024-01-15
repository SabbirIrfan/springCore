package org.example.autowire;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ad1")
@Scope("prototype")
public class ad1 extends Address{

    public ad1(){
        super();
        System.out.println("ad1");

    }
}
