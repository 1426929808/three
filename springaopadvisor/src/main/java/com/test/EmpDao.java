package com.test;

import java.sql.Connection;

public interface EmpDao {
   int deleteEmpsByDeptId(Connection conn, int deptid);
}
