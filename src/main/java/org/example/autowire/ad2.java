package org.example.autowire;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ad2")
@Scope("prototype")
public class ad2 extends Address{

    public ad2(){
        super();
        System.out.println("ad2");

    }
}
