package com.dao.config.simple;

import com.dao.impl.DeptmentDaoImpl;
import com.service.DeptmentService;
import com.service.DeptmentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimpleConfig {
    @Bean
    public DeptmentDaoImpl deptmentDao(){
        return new DeptmentDaoImpl();
    }
    @Bean
    public DeptmentService deptmentService(){
        return new DeptmentServiceImpl();
    }
}
