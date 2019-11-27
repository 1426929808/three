package com.test;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

public class A implements InitializingBean, FactoryBean<A> {
    private B b;


    public A(B b) {
        System.out.println("BBBBBB");
        this.b = b;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "A{" +
                "b=" + b +
                '}';
    }
    public void init(){
        System.out.println("初始化开始");
    }

    //用来创建一个对象
    @Override
    public A getObject() throws Exception {
        return this;
        //return null;
    }
    //bean创建出来的对象class
    @Override
    public Class<?> getObjectType() {
        System.out.println("A的对象class");
        return B.class;
       // return null;
    }
    //返回时否是单例
    @Override
    public boolean isSingleton(){
        return true;
    }
    //在属性设置完毕之后
//    此类中各种setter方法被调用后
//            才调用这个初始化方法
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("此类中各种setter方法被调用后才调用这个初始化方法");
    }
}
