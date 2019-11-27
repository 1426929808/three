package com.dao.config.annotsupport;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


/**
 * ComponentScan类似于xml中的context:componentScan
 * 要求被管理的bean有相关的的注解
 *
 * EnableAspectJAutoProxy注解等价于xml中的aop:aspectj-Auto-Proxy
 *
 * EnableTransactionManagement注解等价于xml中tx:annotation-driven
 *
 * 只需要保证事务管理器的bean的名称为txManager和transactionManager就可以了（名字可以乱写，会根据类型来装配
 * ）
 */

@Configuration//相当于配置了xml文件
@ComponentScan("com")//扫码 针对自己写的来扫描
@EnableAspectJAutoProxy//   切面
@EnableTransactionManagement//事务
public class AnnoSupportTxConfig {

    @Bean//等于一个bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/demo?useSSL=false&serverTimezone=UTC&useUnicode=true&characterEncoding=UTF-8&allowMultiQueries=true");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        //
        // return new DruidDataSource();
        return dataSource;

    }
    @Bean
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

    @Bean
    public DataSourceTransactionManager transactionManager(){
      DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
      transactionManager.setDataSource(dataSource());
      return transactionManager;
    }

}


//