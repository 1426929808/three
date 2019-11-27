package com.service.impl;

import org.springframework.stereotype.Service;

@Service
public class SuanShu {
    public int add(int a,int b){
        System.out.println("开始计算咯");
        return a+b;
    }
}
