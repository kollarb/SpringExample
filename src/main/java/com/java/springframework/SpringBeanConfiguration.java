package com.java.springframework;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan({"com.java"})
public class SpringBeanConfiguration {

	@Bean
    public DataSource dataSource() {
            DriverManagerDataSource dataSource = new DriverManagerDataSource();
            dataSource.setDriverClassName("com.mysql.jdbc.Driver");
            dataSource.setUrl("jdbc:mysql://test.cld167w3fmw5.us-east-1.rds.amazonaws.com:3306/test");
            dataSource.setUsername("root");
            dataSource.setPassword("root1234");
             
            return dataSource;
    }
}
