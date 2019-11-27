package com.spring;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

public class ApplicationContextUtil {
    public static ApplicationContext getApplicationContext(HttpServletRequest request){
        ServletContext servletContext =request.getServletContext();
        ApplicationContext context = (ApplicationContext) servletContext.getAttribute(ApplicationContextInstantiateListener.SPRING_CONFIG_KEY);
        return context;

    }
}
