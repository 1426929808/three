package com.dao.impl;

import com.dao.StudentDao;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao {
    @Override
    public void update() {
        System.out.println("dao  update---");
    }
}
