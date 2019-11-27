package com.nf.service.impl;


import com.nf.dao.DeptmentDao2;

import com.nf.dao.EmployeeDao2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeptmentServiceImpl implements DeptmentService {
    @Autowired
    private DeptmentDao2 deptmentDao;
    @Autowired
    private EmployeeDao2 employeeDao;
    @Transactional
    @Override
    public void deleteById(int deptid) {
        employeeDao.deleteByDeptId(deptid);
        deptmentDao.deleteById(deptid);
    }
}
