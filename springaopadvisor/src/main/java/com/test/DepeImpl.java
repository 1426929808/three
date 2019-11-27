package com.test;

import java.sql.Connection;

public class DepeImpl implements DeptDao {
    @Override
    public int deleteDeptById(Connection connection, int id) {
        return id;
    }
}
