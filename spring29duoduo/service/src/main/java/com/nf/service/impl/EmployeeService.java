package com.nf.service.impl;

import com.nf.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll(int pageNum, int pageSize);
    void  insert(Employee employee);
    void delete(int deptid);
}
