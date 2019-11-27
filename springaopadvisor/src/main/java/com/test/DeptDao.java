package com.test;

import java.sql.Connection;

public interface DeptDao {
    int deleteDeptById(Connection connection, int id);
}
