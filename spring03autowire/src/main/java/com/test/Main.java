package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springcontext-test.xml");
//        B b = context.getBean("test",B.class);

        System.out.println(context);
        A a = context.getBean("test",A.class);
        //A a2 = context.getBean("test",A.class);
        a.getObjectType();
//        System.out.println(b.getClass().getName());
    }
}
