package com.Params;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class ParamsAspect {
    public void before(int m, int n){
        System.out.println(m);
        System.out.println(n);
    }
    public Object aroundParmas(ProceedingJoinPoint joinPoint){
        Object result = null;
        try {
            result=joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        Object [] args = joinPoint.getArgs();
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        return result;
    }
}
