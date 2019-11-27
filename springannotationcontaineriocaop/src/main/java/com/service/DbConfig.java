package com.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:db.properties")
public class DbConfig {
    @Autowired
    private Environment environment;
    @Value("${url}")
    private String url;
    @Value("${driver}")
    private String driver;
    public String geturl(){
        return url;
        //return environment.getProperty("url");
    }
//    public String[] getdbs(){
//        String[] dbs = null;
//
//        return dbs;
//    }
}
