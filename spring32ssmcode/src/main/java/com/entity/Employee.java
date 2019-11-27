package com.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Employee {
    private Integer id;
    private String username;
    private Integer sex;
    private BigDecimal salary;
}
