package com.test;

import java.sql.Connection;

public class EmployeeServiceImpl implements EmployeeService {
    private DeptDao deptDao;

    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    public void setEmpDao(EmpDao empDao) {
        this.empDao = empDao;
    }

    private EmpDao empDao;
    @Override
    public int deleteDeptWithEmps(Connection conn, int deptid) {
        return deptid;
    }
}
