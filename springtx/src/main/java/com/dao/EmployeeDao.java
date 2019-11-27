package com.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao extends BaseDao {

    public void deleteByEmpId(int deptid){
        String sql = "delete from employee where deptid =?";
        jdbcTemplate.update(sql,deptid);
    }
}
