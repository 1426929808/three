package com;

import com.entity.Student;
import com.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
        StudentService studentService = context.getBean("studentservice",StudentService.class);
        List<Student> students = studentService.getall(3,4);
        for (Student student : students) {
            System.out.println(student);
        }
    }



}
