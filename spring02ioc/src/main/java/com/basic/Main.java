package com.basic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springcontext-basic.xml");
        DbConfig dbConfig = context.getBean("dbconfig",DbConfig.class);
        Address address = context.getBean("addre",Address.class);
        UserInfo userInfo = context.getBean("userinfo",UserInfo.class);
        System.out.println(dbConfig);
        System.out.println(address);
       System.out.println(userInfo);
    }
}
