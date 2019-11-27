package com.service.impl;


import com.dao.config.annotsupport.AnnoSupportConfig;
import com.service.DeptmentService;
import com.service.DeptmentServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnoSupportConfigTest {

    @Test
    public void testSimpleConfig(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnoSupportConfig.class);
        DeptmentService deptmentService = context.getBean(DeptmentService.class);
        deptmentService.delete();
    }


}
