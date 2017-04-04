package com.examples.dao;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import com.examples.dao.impl.UserDAOImpl;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DAOConfiguration {
	@Value("${spring.datasource.username}")
	private String user;

	@Value("${spring.datasource.password}")
	private String password;

	@Value("${spring.datasource.url}")
	private String dataSourceUrl;

	@Value("${spring.datasource.dataSourceClassName}")
	private String dataSourceClassName;

	@Value("${spring.datasource.poolName}")
	private String poolName;
	
	@Value("${spring.datasource.maximumPoolSize}")
	private int maximumPoolSize;
	
	@Bean
	public UserDAO createUserDAO() {
		UserDAOImpl userDAO = new UserDAOImpl();
		return userDAO;
	}
	
	/**
	 * create datasource bean
	 */
	@Bean
	public DataSource createDataSource() {
		Properties configProps = new Properties();
		configProps.put("jdbcUrl", dataSourceUrl);
		configProps.put("username", user);
		configProps.put("password", password);
//		Properties configProps = new Properties();
//		configProps.put("dataSourceClassName", dataSourceClassName);
		configProps.put("poolName",poolName);
		configProps.put("maximumPoolSize",maximumPoolSize);
		
		HikariConfig hc = new HikariConfig(configProps);
		HikariDataSource ds = new HikariDataSource(hc);
		return ds;
	}
}
