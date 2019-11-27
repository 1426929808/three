package com.nf.service.impl;

import com.nf.dao.DeptmentDao;
import com.nf.dao.EmployeeDao;
import com.nf.service.DeptmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class DeptmentServiceImpl implements DeptmentService {
    @Autowired
    private DeptmentDao deptmentDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Transactional
    @Override
    public void deleteById(int deptid) {
        employeeDao.deleteByDeptId(deptid);
        deptmentDao.deleteById(deptid);
    }
}
