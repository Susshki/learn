package com.sushma.springmvc.service;

import org.springframework.stereotype.Service;

@Service
public class UserValidationService {
	public boolean isValidService(String username, String password) {
		if(username.equals("sushma") && password.equals("kiran")) {
			return true;
		}
		
		return false;
	}
}
