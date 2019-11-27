package com;

import com.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
        StudentService studentService = context.getBean("studentService",StudentService.class);
        int restult = studentService.add(3,5);
        System.out.println(restult);

    }
}
