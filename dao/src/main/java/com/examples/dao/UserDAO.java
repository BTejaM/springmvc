package com.examples.dao;

import com.examples.dao.entity.User;

public interface UserDAO {
	
	public String getUserName();
	public com.examples.domain.User getUser();
	public User findUser(int id);
	
}
