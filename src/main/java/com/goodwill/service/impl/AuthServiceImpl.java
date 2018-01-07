package com.goodwill.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goodwill.dao.UserDao;
import com.goodwill.domain.User;
import com.goodwill.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService{

	@Autowired
	private UserDao userDao;

	@Override
	public User Login(Map<String,String> credentials) {
		User user = userDao.findByUsername(credentials.get("username"));
		if(user!= null) {
			String password = user.getpassword();
			if(password.equals(credentials.get("password"))) {
				return user;
			}else {
				return null;
			}
		}else {
			return null;
		}
	}

	@Override
	public User SignUp(Map<String, String> user) {
		User existUser = userDao.findByUsername(user.get("username"));
		if(existUser==null) {
			int total = userDao.createUser(user.get("username"),user.get("password"),user.get("realname"));
			if(total>0)
				return userDao.findByUsername(user.get("username"));
			else
				return null;
		}else {
			return null;
		}
		
	}	
}
