package com.dao;

public class DeptDao extends BaseDao {
    public void deleteDeptBydeptid(int deptid){
        String sql = "delete from deptment where deptid=?";
        jdbcTemplate.update(sql,deptid);
    }
}
