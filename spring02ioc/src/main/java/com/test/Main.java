package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springcontext-test.xml");
        //SqlSessionFactory sqlSessionFactory = context.getBean("test2",SqlSessionFactory.class);
        B b = context.getBean("test",B.class);
        System.out.println(b.getClass().getName());
       // System.out.println(sqlSessionFactory.getClass().getName());


    }
}
