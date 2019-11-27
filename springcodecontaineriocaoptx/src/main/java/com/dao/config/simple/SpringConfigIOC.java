package com.dao.config.simple;

import com.dao.DeptmentDao;
import com.dao.impl.DeptmentDaoImpl;
import com.service.DeptmentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigIOC {
    @Bean
    public DeptmentDaoImpl deptmentDao(){
        return new DeptmentDaoImpl();
    }
    @Bean
    public DeptmentServiceImpl deptmentService(DeptmentDao deptmentDao){
        DeptmentServiceImpl deptmentService = new DeptmentServiceImpl();
        deptmentService.setDeptmentDao(deptmentDao);
        return deptmentService;
    }
}
