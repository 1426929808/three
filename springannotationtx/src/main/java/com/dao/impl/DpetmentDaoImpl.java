package com.dao.impl;

import com.dao.DeptementDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DpetmentDaoImpl implements DeptementDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void delete() {
        String sql = "delete from deptment where deptid=27";
        jdbcTemplate.update(sql);
    }
}
