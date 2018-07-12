package com.sushma.JPA2.JPACrudOperations;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sushma.JPA2.JPACrudOperations.entities.User;
import com.sushma.JPA2.JPACrudOperations.repos.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaCrudOperationsApplicationTests {

	@Autowired
	UserRepository userRepository;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void saveUser() {
		userRepository.save(new User("Kiran", "kiran@gmail.com"));
	}
	
	@Test
	public void updateUser() {
		Optional<User> userOpt = userRepository.findById(6);
		if(userOpt.isPresent()) {
			User user = userOpt.get();
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>User.Id"+user.getId());
			user.setEmail("sumi@gmail.com");
			userRepository.save(user);
		}
		
		
	}
	
	@Test
	public void deleteUser() {
		userRepository.deleteById(1);
	}
	
	@Test
	public void getAllUsers() {
		Iterable<User> users = userRepository.findAll();		
		System.out.println(users);
	}
	
	@Test
	public void getUsersById() throws Exception {
		Optional<User> user = userRepository.findById(3);
		if(user.isPresent()) {
			throw new Exception();
		}
		System.out.println(user.get());
	}
	
	
	@Test
	public void getNumOfUsers() {
		long count = userRepository.count();
		System.out.println(count);
	}
	
}
