package com.service.emp.impl;

import com.service.emp.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public void getAll() {
        System.out.println("getAll in employeeServiceImpl");
    }

    @Override
    public void getById() {
        System.out.println("getById in employeeServiceImpl");

    }

    @Override
    public void deleteById() {
        System.out.println("delete in employeeServiceImpl");
    }

    public void xxx(){
        System.out.println("xxx");
    }
}
