package com.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        studentDao.insert();
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    }
}
