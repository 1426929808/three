package com.advisor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;
//
public class MyAdvisor implements MethodBeforeAdvice, AfterReturningAdvice, MethodInterceptor, ThrowsAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("before");
    }
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("afterRestult"+o);
    }
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("before----");
        Object result = methodInvocation.proceed();
        System.out.println("after----");
        return result;
    }
    public void afterThrowing(Method method, Object[] objects, Object o,RuntimeException re)throws Throwable{
        System.out.println("throwing"+re.getMessage());
    }


}
