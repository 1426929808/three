package com.test;

import java.sql.Connection;

public class EmpImpl implements EmpDao {
    @Override
    public int deleteEmpsByDeptId(Connection conn, int deptid) {
        return deptid;
    }
}
