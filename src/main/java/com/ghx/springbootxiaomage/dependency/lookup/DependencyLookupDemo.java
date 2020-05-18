package com.ghx.springbootxiaomage.dependency.lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyLookupDemo {
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("META-INF\\dependency-lookup-context.xml");
        Person person = context.getBean(Person.class);
        System.out.println(person);
    }
}
