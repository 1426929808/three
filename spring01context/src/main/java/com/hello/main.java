package com.hello;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        //ApplicationContext代表着spring容器,是个接口
        //spring的容器指的就是ApplicationContext这种类型的接口体系
        //ApplicationContext是一个容器类

        //容器的启动:指的就是实例化一个容器实现类的时候,
        //容器的关闭:一般是容器对象被销毁或者调用其close方法
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
        TheFirst theFirst = (TheFirst) context.getBean("first");
        TheFirst theFirst1=context.getBean("first",TheFirst.class);
        System.out.println(theFirst);
        System.out.println(theFirst1);
    }
}
