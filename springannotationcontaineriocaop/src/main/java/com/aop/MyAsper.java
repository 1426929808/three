package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAsper {
    @Pointcut("execution(* com.service..*.*(..))")
    public void myPointcut(){

    }
    @Before("myPointcut()")
    public void before(){
        System.out.println("before------");
    }
    @After("myPointcut()")
    public void after(){
        System.out.println("after------");
    }
    @AfterReturning("myPointcut()")
    public void afterReturn(){
        System.out.println("afterReturn---");
    }
    @Around("myPointcut()")
    public Object aroud(ProceedingJoinPoint point){
        Object result = null;
        try {
            System.out.println("around before");
         result = point.proceed();
            System.out.println("around after return");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("around after");
        return result;
    }
}
