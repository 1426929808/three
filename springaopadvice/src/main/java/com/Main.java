package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
        StudentServiceImpl service = context.getBean("studentservice",StudentServiceImpl.class);
        service.update();
        service.insert();
    }
}
