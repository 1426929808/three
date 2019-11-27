package com.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Yuangong {

    void delete(@Param("id") int id);
    com.entity.Yuangong getById(@Param("id") int id);
    List<com.entity.Yuangong> getall(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);
}
