package com.service.impl;

import com.dao.StudentDao;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Scope("singleton")
public class StudentServiceImpl implements StudentService {

    @Autowired
   // @Qualifier("studentDaoImpl")
    private StudentDao studentDao;


    @Override
    public void update() {
        System.out.println("service update---");
    }
    @PostConstruct
    public void init(){
        System.out.println("init----");
    }
    @PreDestroy
    //这个销毁方法的实现，需要手动去调用
    //((ConfigurableApplicationContext) context).close();
    public void destroy(){
        System.out.println("destroy------");
    }
}
