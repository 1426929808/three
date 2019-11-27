package com.complect;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springcontext-complect.xml");
        UserServiceImpl userService = context.getBean("userService",UserServiceImpl.class);
        userService.update();
    }


}
