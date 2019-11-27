package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =new  ClassPathXmlApplicationContext("springcontext.xml");
        StudentService service = context.getBean("studentservice",StudentService.class);
        service.insert();
        service.update();
    }
}
