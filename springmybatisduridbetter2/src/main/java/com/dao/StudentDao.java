package com.dao;

import com.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    List<Student> getall(@Param("pageNum") int pageNum,@Param("pageSize") int pageSize);
}
