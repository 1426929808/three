package com.service.impl;

import com.dao.DeptmentDao;
import com.dao.EmployeeDao;
import com.entity.Employee;
import com.service.EmoloyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmoloyeeService {
    @Autowired
    private DeptmentDao deptmentDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Transactional
    @Override
    public void deleteAfterinsert() {
        deptmentDao.delete();
        employeeDao.insert();
    }

    @Override
    public List<Employee> getall(int pageNum, int pageSize) {
        return employeeDao.getall(pageNum,pageSize);
    }
}
