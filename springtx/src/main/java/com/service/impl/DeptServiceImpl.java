package com.service.impl;

import com.dao.DeptDao;
import com.dao.EmployeeDao;

public class DeptServiceImpl {
    private DeptDao deptDao;
    private EmployeeDao employeeDao;

    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
    public  void deleteDeptWithEmpbydeptid(int deptid){

        employeeDao.deleteByEmpId(deptid);
        deptDao.deleteDeptBydeptid(deptid);
    }
}
