package comsushma.springboot.webProjUserCustomExp7.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import comsushma.springboot.webProjUserCustomExp7.exception.ResourceNotFoundException;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return service.getUsers();
	}
	
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable int id) {
		User user = service.getUser(id);
		if(user == null) {
			System.out.println("((((((((((((((((((((((((((((((((((((((((((((((((");
			throw new ResourceNotFoundException("Id -"+id +" does not exist");
		}
		return user;
	}
}
