package com.nf.dao;

import com.nf.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeDao2 {
    List<Employee> getAll(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);

    void  insert(Employee employee);

    void deleteByDeptId(int deptid);
}
