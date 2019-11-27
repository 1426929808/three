package com.nf.entity;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Data
public class Employee {
    private Integer id;
    @NotEmpty
    @Size(min = 1,max = 10)
    private String username;
    private Integer sex;
    @Min(0)
    private BigDecimal salary;


}
