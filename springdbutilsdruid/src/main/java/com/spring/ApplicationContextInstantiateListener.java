package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ApplicationContextInstantiateListener implements ServletContextListener {
    public static final String SPRING_CONFIG_KEY="SPRING_CONTAINER";
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
        ServletContext servletContext =servletContextEvent.getServletContext();
        servletContext.setAttribute(SPRING_CONFIG_KEY,context);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
