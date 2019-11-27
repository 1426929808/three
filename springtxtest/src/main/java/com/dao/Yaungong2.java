package com.dao;

import com.entity.Yuangong;
import org.apache.ibatis.annotations.Param;

public interface Yaungong2 {

    void insert(@Param("YG") Yuangong yuangong);
}
