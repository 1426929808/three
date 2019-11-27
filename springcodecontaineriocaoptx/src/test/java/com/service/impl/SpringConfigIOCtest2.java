package com.service.impl;

import com.dao.config.simple.SpringConfigIOC2;
import com.service.DeptmentServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringConfigIOCtest2 {
    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigIOC2.class);
        DeptmentServiceImpl deptmentService = context.getBean(DeptmentServiceImpl.class);
        deptmentService.delete();
    }
}
