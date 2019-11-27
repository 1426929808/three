package com.facotry;

import com.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springContextFactory.xml");
        StudentService studentService = context.getBean("factoryTest",StudentService.class);
        int result = studentService.add(4,4);
        System.out.println(result);
    }


}
