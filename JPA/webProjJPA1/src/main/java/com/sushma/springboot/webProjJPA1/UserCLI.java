package com.sushma.springboot.webProjJPA1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sushma.springboot.webProjJPA1.dao.UserDaoService;
import com.sushma.springboot.webProjJPA1.model.User;

@Component
public class UserCLI implements CommandLineRunner {

	@Autowired
	private UserDaoService userDaoService;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jack", "jack@gmail.com");
		userDaoService.insert(user);
	}

}
