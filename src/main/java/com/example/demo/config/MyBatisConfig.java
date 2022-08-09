package com.example.demo.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class MyBatisConfig {
	@Autowired
	private DataSource dataSource;
	
	
	
	@Bean
	public SqlSessionFactory SqlSessionFactory() throws Exception {
		SqlSessionFactoryBean FactoryBean=new SqlSessionFactoryBean();
		FactoryBean.setDataSource(dataSource);
		return FactoryBean.getObject();
	}
}
