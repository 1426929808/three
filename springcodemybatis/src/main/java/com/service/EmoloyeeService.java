package com.service;

import com.entity.Employee;

import java.util.List;

public interface EmoloyeeService {
    void deleteAfterinsert();
    List<Employee> getall(int pageNum,int pageSize);
}
