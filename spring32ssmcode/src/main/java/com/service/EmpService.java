package com.service;

import com.dao.EmpDao;
import com.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    private EmpDao empDao;

    public List<Employee> getAll(int pageNum,int pageSize){
        return empDao.getAll(pageNum,pageSize);
    }
}
