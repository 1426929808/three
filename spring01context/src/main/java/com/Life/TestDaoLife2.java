package com.Life;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TestDaoLife2 implements InitializingBean, DisposableBean {

//    这个方法名取名叫:"在属性设置完毕之后"
//    其意思就是此类中各种setter方法被调用后
//            才调用这个初始化方法


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("销毁");
    }
}
