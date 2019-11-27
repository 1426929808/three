package com.service;

import com.dao.StudentDao;
import com.entity.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public Student getById() {
        return studentDao.getById();
    }

    @Override
    public List<Student> getall() {
        return studentDao.getall();
    }
}
