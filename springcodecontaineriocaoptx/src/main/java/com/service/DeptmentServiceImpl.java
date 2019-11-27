package com.service;

import com.dao.DeptmentDao;
import com.dao.EmployeeDao;
import com.dao.impl.DeptmentDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//@Service


public class DeptmentServiceImpl implements DeptmentService {
    @Autowired
    private DeptmentDao deptmentDao;




    public void setDeptmentDao(DeptmentDao deptmentDao) {
        this.deptmentDao = deptmentDao;
    }


    @Override
    public void delete() {
        deptmentDao.delete();
    }
}
