package com.examples.dao.impl;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.examples.dao.UserDAO;
import com.examples.dao.entity.User;

public class UserDAOImpl implements UserDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public String getUserName() {
		return "SATISH";
	}
	
	@Override
	public com.examples.domain.User getUser() {
//		em.
		com.examples.domain.User user = new com.examples.domain.User();
		user.setFirstName("SATISH");
		user.setLastName("BOTLA");
		user.setDob(new Date());
		return user;
	}
	
	public User findUser(int id) {
		return em.find(User.class, id);
	}
	
}
