package com.sushma.springweb.service;


public class UserValidationService {
	public boolean isValidUser(String userName, String password) {
		if(userName.equals("sushma") && password.equals("uppuluri")) {
			return true;
		}
		return false;
	}
}
