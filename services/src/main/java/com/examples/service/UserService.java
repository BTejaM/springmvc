package com.examples.service;

import com.examples.domain.User;

public interface UserService {
	
	public String getUserName();
	public User getUser();
	
	public User findUser(int id);
}
