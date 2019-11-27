package com.service.impl;

import com.dao.config.annotsupport.AnnoSupportTxConfig;
import com.service.DeptmentServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnoSupporttxtest {
    @Test
    public void testtx(){
            ApplicationContext context = new AnnotationConfigApplicationContext(AnnoSupportTxConfig.class);
        DeptmentServiceImpl3 service = context.getBean(DeptmentServiceImpl3.class);
        service.test();
    }

}
