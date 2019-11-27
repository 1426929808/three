package com.service;

import com.service.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestTx {
    @Autowired
    private ApplicationContext applicationContext;
    @Test
    public void testtxone(){
      DpetServiceImpl dpetService =  applicationContext.getBean(DpetServiceImpl.class);
      dpetService.testtx();
    }
}
