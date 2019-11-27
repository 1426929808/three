package com.service.impl;

import com.dao.StudentDao;
import com.entity.Student;
import com.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> getall(int pageNum, int pageSize) {
        return studentDao.getall(pageNum,pageSize);
    }
}
