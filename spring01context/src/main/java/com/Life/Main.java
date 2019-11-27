package com.Life;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        //这个是全局beans和单个bean的init（）和destory（）的测试
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springcontextLife.xml");
//        TestDaoLife testDaoLife = context.getBean("daolife",TestDaoLife.class);
//        System.out.println(testDaoLife);
//        //((ConfigurableApplicationContext)context).close();等价于context.close
//        context.close();


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springcontextLife.xml");
        TestDaoLife2 testDaoLife2 = context.getBean("daolife2",TestDaoLife2.class);
        System.out.println(testDaoLife2);
        //((ConfigurableApplicationContext)context).close();等价于context.close
        context.close();

    }
}
