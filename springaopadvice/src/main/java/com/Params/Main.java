package com.Params;

import com.StudentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springContectParams.xml");
        StudentServiceImpl service = context.getBean("studentService",StudentServiceImpl.class);
        int result = service.add(4,5);
        System.out.println(result);
    }
}
