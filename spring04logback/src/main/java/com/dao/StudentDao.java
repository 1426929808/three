package com.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StudentDao {
    private static final Logger logger = LoggerFactory.getLogger(StudentDao.class);
    public void insert(){
        logger.info("insert into studentdao !");
    }
}
