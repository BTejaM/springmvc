package com.examples.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.examples.domain.User;
import com.examples.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private ObjectMapper mapper;
	
	/**
	 * Gets user object
	 * @param userId
	 */
	public void getUser(String userId) {
		
	}
	
	/**
	 * Creates a new user object and persists it
	 * @param user
	 */
	public void createUser(User user) {
		
	}
	
	/**
	 * Update user object and persists it
	 * @param user
	 */
	public void updateUser(User user) {
		
	}
	
	/**
	 * Removes user object from the persistance layer
	 * @param userId
	 */
	public void deleteUser(String userId) {
		
	}
}
