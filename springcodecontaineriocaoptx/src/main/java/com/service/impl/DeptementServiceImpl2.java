package com.service.impl;

import com.dao.DeptmentDao;
import com.service.DeptmentService;

public class DeptementServiceImpl2 implements DeptmentService {
    private DeptmentDao deptmentDao;

    public void setDeptmentDao(DeptmentDao deptmentDao) {
        this.deptmentDao = deptmentDao;
    }

    @Override
    public void delete() {
        System.out.println("delete2222222");
        deptmentDao.delete();
    }
}
