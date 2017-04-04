package com.examples.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.examples.service.impl.UserServiceImpl;

@Configuration
public class ServicesConfiguration {

	@Bean
	public UserService createUserService() {
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		return userServiceImpl;
	}
	
}
