package com;

import com.dao.DeptmentDao;
import com.dao.impl.DeptmentDaoImpl;
import com.service.impl.DeptementServiceImpl2;
import com.service.DeptmentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration

public class HelloConfig {
    @Bean
    public DeptmentDaoImpl deptmentDao(){
        return new DeptmentDaoImpl();
    }
    @Bean
    public DeptmentServiceImpl deptmentService(DeptmentDao deptmentDao){
        DeptmentServiceImpl deptmentService =new DeptmentServiceImpl();
        deptmentService.setDeptmentDao(deptmentDao);
        return deptmentService;
    }
    @Bean
    public DeptementServiceImpl2 deptementServiceImpl2(DeptmentDao deptmentDao){
        DeptementServiceImpl2 deptementServiceImpl2 = new DeptementServiceImpl2();
        deptementServiceImpl2.setDeptmentDao(deptmentDao);
        return deptementServiceImpl2;
    }

}
