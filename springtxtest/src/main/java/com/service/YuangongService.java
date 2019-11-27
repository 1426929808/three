package com.service;

import com.dao.Yaungong2;
import com.dao.Yuangong;

import java.util.List;

public class YuangongService {
    private Yuangong yuangong;
    private Yaungong2 yaungong2;

    public void setYuangong(Yuangong yuangong) {
        this.yuangong = yuangong;
    }

    public void setYaungong2(Yaungong2 yaungong2) {
        this.yaungong2 = yaungong2;
    }

    public void insertwithdelete(com.entity.Yuangong yg,int id){
        yaungong2.insert(yg);
        yuangong.delete(id);
    }
    public List<com.entity.Yuangong> getall(int pageNum,int pageSize){
        return yuangong.getall(pageNum,pageSize);
    }
    public com.entity.Yuangong getById(int id){
        return yuangong.getById(id);
    }

}
