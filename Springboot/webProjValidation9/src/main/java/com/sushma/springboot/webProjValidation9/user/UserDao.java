package com.sushma.springboot.webProjValidation9.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
	
	private static List<User> users = new ArrayList<User>();
	
	static {
		users.add(new User("A1001", "Sushma", new Date(), "sushma@gmail.com", "A"));
		users.add(new User("B0001", "Kiran", new Date(), "kiran@gmail.com", "B"));
		users.add(new User("C00001", "Kumara Swamy", new Date(), "kumar@gmail.com", "A"));
	}

	public List<User> getUsers() {
		return users;
	}
	
	public User getUser(String id) {
		for(User user: users) {
			if(user.getUserId().equalsIgnoreCase(id)) {
				return user;
			}
		}
		return null;
	}

	public User addUser(User user) {	
		
		if(user == null)
			users.add(user);
		return user;
	}

}
