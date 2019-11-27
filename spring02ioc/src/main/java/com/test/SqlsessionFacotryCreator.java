package com.test;

import java.util.Properties;

public class SqlsessionFacotryCreator {

    private Properties properties;
    public SqlSessionFactory create(){
        return new SqlSessionFactory(properties);
    }
}
