package com.dao;

import com.entity.Student;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class StudentDaoImpl implements Studentdao {
    private QueryRunner queryRunner;

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    @Override
    public Student getById() {
        String sql = "select stuid,stuname from student where stuid =1";
        BeanHandler<Student> handler = new BeanHandler<>(Student.class);
        Student student = null;
        try {
             student = queryRunner.query(sql,handler);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }
}
