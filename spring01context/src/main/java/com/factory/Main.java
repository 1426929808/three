package com.factory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //通过工厂模式得到静态方法中的A类
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springcontextFactory.xml");
//       //创建出来的对象的A.class
//        A intances = context.getBean("factory",A.class);
//        System.out.println(intances.getClass().getName());


        //通过工厂模式得到实例方法中的A类
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springcontextFactory.xml");
//       //factory2必须和xml中第二个bean中的id相匹配
//        A intances = context.getBean("factory2",A.class);
//        System.out.println(intances.getClass().getName());

        //通过实现接口来得到A类
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springcontextFactory.xml");
        A intances = context.getBean("factory3",A.class);
        System.out.println(intances);
    }
}
