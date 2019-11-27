package com;

import org.aspectj.lang.ProceedingJoinPoint;

import java.sql.SQLException;

public class LogImpl {
    public void before(ProceedingJoinPoint point){
        System.out.println("before----");
    }
    public void after(){
        System.out.println("after----");
    }
    public void afterreturn(){
        System.out.println("afterreturn-----");
    }
    public void throwadvice(SQLException re){
        System.out.println("debug  "+re);
        System.out.println("throwadvice-----");
    }


    public void aroundadvice(ProceedingJoinPoint joinPoint){
        System.out.println("aroundvice before----");
        try {
            //显示调用目标方法，例如案例中的insert、update方法一样
            joinPoint.proceed();
            System.out.println("arounvice return---");
        }catch (Throwable re){
            System.out.println("aroundvice throwing----");
        }
        System.out.println("aroundvice after----");
    }
    public Object aroundadvice2(ProceedingJoinPoint joinPoint){
        Object  result = null;
        System.out.println("aroundvice before22----");
        try {
            //显示调用目标方法，例如案例中的insert、update方法一样
            joinPoint.proceed();
            System.out.println("arounvice return22---");
        }catch (Throwable re){
            System.out.println("aroundvice throwing22----");
        }
        System.out.println("aroundvice after222----");
        return result;
    }
}
