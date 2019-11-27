package com.dao;

import com.entity.Student;

import java.util.List;


public interface StudentDao {

    Student getById();
    List<Student> getall();
}
