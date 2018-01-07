package com.goodwill.service;

import java.util.Map;


import com.goodwill.domain.User;

public interface AuthService {
	User Login(Map<String,String> credentials);
	User SignUp(Map<String,String> user);
}
