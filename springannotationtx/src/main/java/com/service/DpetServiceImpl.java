package com.service;

import com.dao.DeptementDao;
import com.dao.EmployeeDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DpetServiceImpl {
    private DeptementDao deptementDao;
    private EmployeeDao employeeDao;

    public DpetServiceImpl(DeptementDao deptementDao, EmployeeDao employeeDao) {
        this.deptementDao = deptementDao;
        this.employeeDao = employeeDao;
    }
    @Transactional(readOnly = false)//只查询
    public void  testtx(){
        deptementDao.delete();
        employeeDao.insert();

    }
}
