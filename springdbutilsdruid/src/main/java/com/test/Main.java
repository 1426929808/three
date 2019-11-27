package com.test;

import com.entity.Student;
import com.service.StudentService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
        StudentService studentService = context.getBean("studentService",StudentService.class);
        Student student = studentService.getById();
        System.out.println(student);
    }
}
