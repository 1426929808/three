package com.service.impl;

import com.dao.DeptmentDao;
import com.dao.config.simple.SimpleConfig;
import com.service.DeptmentServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SimpleConfigTest {
    @Test
    public void testSimpleConfig(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SimpleConfig.class);
        DeptmentServiceImpl deptmentDao = context.getBean(DeptmentServiceImpl.class);
        System.out.println(deptmentDao);

        DeptmentDao dao =context.getBean(DeptmentDao.class);
        System.out.println(dao);
    }
}
