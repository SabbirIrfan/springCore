package org.example.autowire;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Employee implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Autowired
    @Qualifier("ad2")
    private Address address;

    protected Address getAddress() {
// notice the Spring API dependency!
        return this.applicationContext.getBean("ad2", Address.class);
    }

    public Employee(Address address) {
        this.address = address;
    }

    public Employee() {
        super();
    }

//    public Address getAddress() {
//        return address;
//    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return address.toString();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

}
