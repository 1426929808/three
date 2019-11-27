package com.service;

import com.dao.DeptmentDao;
import com.dao.EmployeeDao;

public class TestService {
    private DeptmentDao deptmentDao;
    private EmployeeDao employeeDao;

    public void setDeptmentDao(DeptmentDao deptmentDao) {
        this.deptmentDao = deptmentDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
    public void testMethod(){
        employeeDao.delete();
        deptmentDao.insert();
    }
}
