package com.sushma.springboot.webProjValidation9.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //This will help spring manage this bean as we autowire this in the Contoller.
public class UserService {
	
	@Autowired
	private UserDao dao = null;
	
	public List<User> getAllUsers(){
		return dao.getUsers();
	}
	
	public User getUser(String id) {
		return dao.getUser(id);
	}

	public User addUser(User user) {
		return dao.addUser(user);
	}

}
