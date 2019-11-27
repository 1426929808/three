package com.nf.service.impl;


import com.nf.dao.EmployeeDao2;
import com.nf.entity.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao2 employeeDao;
    @Override
    public List<Employee> getAll(int pageNum, int pageSize) {
        return employeeDao.getAll(pageNum,pageSize);
    }

    @Override
    public void insert(Employee employee) {
        employeeDao.insert(employee);
    }

    @Override
    public void delete(int deptid) {
        System.out.println("正在删除");
        employeeDao.deleteByDeptId(deptid);
    }
}
