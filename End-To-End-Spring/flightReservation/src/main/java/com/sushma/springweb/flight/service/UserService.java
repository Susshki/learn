package com.sushma.springweb.flight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sushma.springweb.flight.entities.User;
import com.sushma.springweb.flight.repos.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User addUser(User user) {
		return userRepository.save(user);
	}
	
	public User findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}
}
