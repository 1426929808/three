package com.nf.service;

import com.nf.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll(int pageNum,int pageSize);
    void  insert(Employee employee);
}
