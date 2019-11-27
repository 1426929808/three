package com.service;

import com.HelloConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DeptmentTest {
    @Test
    public void testcontext(){
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloConfig.class);
        DeptmentService deptmentService= context.getBean(DeptmentService.class);
        deptmentService.delete();
    }
}
