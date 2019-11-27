package com.service.impl;

import com.dao.DeptmentDao;
import com.dao.EmployeeDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DeptmentServiceImpl3  {

    private DeptmentDao deptmentDao;
    private EmployeeDao employeeDao;

    public DeptmentServiceImpl3(DeptmentDao deptmentDao, EmployeeDao employeeDao) {
        this.deptmentDao=deptmentDao;
        this.employeeDao = employeeDao;
    }


    public void  test(){
        deptmentDao.delete();
        employeeDao.insert();
    }

    public void delete() {
        deptmentDao.delete();
    }
}
