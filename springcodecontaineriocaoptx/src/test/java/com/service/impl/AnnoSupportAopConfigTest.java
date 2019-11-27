package com.service.impl;


import com.dao.config.annotsupport.AnnoSupportAopConfig;
import com.service.DeptmentService;
import com.service.DeptmentServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnoSupportAopConfigTest {

    @Test
    public void testSimpleConfig(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnoSupportAopConfig.class);
        DeptmentService deptmentService = context.getBean(DeptmentService.class);
        deptmentService.delete();
    }



}
