package com.sushma.springboot.webProjValidation9.user;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService service = null;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return service.getAllUsers();
	}
	
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable String id) {
		return service.getUser(id);
	}
	
	@PostMapping("/users")
	public User addUser(@Valid @RequestBody User user) throws Exception{
		return service.addUser(user);
	}
}
