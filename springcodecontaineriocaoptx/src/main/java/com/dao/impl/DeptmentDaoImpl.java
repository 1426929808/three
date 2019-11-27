package com.dao.impl;

import com.dao.DeptmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DeptmentDaoImpl implements DeptmentDao {

    public DeptmentDaoImpl() {
        System.out.println("Deptmentdao的构造函数");
    }
    @Autowired
    public JdbcTemplate jdbcTemplate;

    @Override
    public void delete() {
        System.out.println("delete----");
        String sql = "delete from deptment where deptid=32";
        jdbcTemplate.update(sql);
    }
}
