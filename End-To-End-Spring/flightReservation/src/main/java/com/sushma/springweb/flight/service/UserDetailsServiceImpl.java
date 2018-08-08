package com.sushma.springweb.flight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sushma.springweb.flight.repos.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		com.sushma.springweb.flight.entities.User user = userRepository.findByEmail(username);
		
		if(user  == null) {
			throw new UsernameNotFoundException("User Not Found");
		}
		
		return new User(user.getEmail(), user.getPasscode(), user.getRoles());
	}

}
