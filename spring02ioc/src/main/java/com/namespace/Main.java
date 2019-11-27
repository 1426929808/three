package com.namespace;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Springcontext-namespace.xml");
        MyDataSource myDataSource = context.getBean("factory",MyDataSource.class);
        System.out.println(myDataSource);
    }
}
