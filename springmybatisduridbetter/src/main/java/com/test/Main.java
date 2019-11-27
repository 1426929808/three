package com.test;

import com.entity.Student;
import com.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class  Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
        StudentService studentService = context.getBean("studentService",StudentService.class);
        Student student = studentService.getById();
        List<Student> students = studentService.getall();
        System.out.println(student);
        for (Student student1 : students) {
            System.out.println(student1);
        }
    }
}
