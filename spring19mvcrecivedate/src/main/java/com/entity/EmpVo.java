package com.entity;

import java.util.List;

public class EmpVo {
    private List<Emp> emps;

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "EmpVo{" +
                "emps=" + emps +
                '}';
    }
}
