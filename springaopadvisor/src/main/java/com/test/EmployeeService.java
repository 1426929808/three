package com.test;

import java.sql.Connection;

public interface EmployeeService {
   int deleteDeptWithEmps(Connection conn, int deptid);
}
