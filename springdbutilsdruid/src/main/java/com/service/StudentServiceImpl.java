package com.service;

import com.dao.Studentdao;
import com.entity.Student;

public class StudentServiceImpl implements StudentService {
    private Studentdao studentdao;

    public void setStudentdao(Studentdao studentdao) {
        this.studentdao = studentdao;
    }

    @Override
    public Student getById() {
        return studentdao.getById();
    }
}
