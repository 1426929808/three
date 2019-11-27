package com.sevice;

import com.dao.DeptmentDao;
import com.entity.Deptment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DpetServiceImpl implements DeptService {
    @Autowired
    private DeptmentDao deptmentDao;

    public void setDeptmentDao(DeptmentDao deptmentDao) {
        this.deptmentDao = deptmentDao;
    }

    @Transactional
    @Override
    public void insert(Deptment deptment) {
        deptmentDao.insertdept(deptment);
    }
}
