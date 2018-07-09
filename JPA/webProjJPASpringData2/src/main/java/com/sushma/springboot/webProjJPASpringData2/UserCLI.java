package com.sushma.springboot.webProjJPASpringData2;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sushma.springboot.webProjJPASpringData2.dao.UserRepository;
import com.sushma.springboot.webProjJPASpringData2.model.User;

@Component
public class UserCLI implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Sushma", "sushma@gmail.com");
		userRepository.save(user);
		
		//retrieve user
		Optional<User> userById = userRepository.findById(user.getId());
		System.out.println("Retrieved User:"+userById);
		
		//add Kran
		User user2 = new User("Kiran", "kiran@gmail.com");
		userRepository.save(user2);
		
		List<User> users = userRepository.findAll();
		System.out.println("List:"+users);
	}

}
