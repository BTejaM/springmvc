package com.examples.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.examples.dao.UserDAO;
import com.examples.dao.entity.User;
import com.examples.service.UserService;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	public String getUserName() {
		return userDAO.getUserName();
	}
	
	public com.examples.domain.User getUser() {
		return userDAO.getUser();
	}
	
	public com.examples.domain.User findUser(int id) {
		return convert(userDAO.findUser(id));
	}
	
	/**
	 * convert entities into domain objects
	 * TODO streamline this into a common place
	 * @return
	 */
	private com.examples.domain.User convert(User t) {
		com.examples.domain.User usr = new com.examples.domain.User();
		usr.setFirstName(t.getFirstname());
		usr.setLastName(t.getLastname());
		usr.setDob(t.getDob());
		
		return usr;
	}
	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	
}
