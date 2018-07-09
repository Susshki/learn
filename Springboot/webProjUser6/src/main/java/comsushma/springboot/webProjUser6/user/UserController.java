package comsushma.springboot.webProjUser6.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserController {
	
	@Autowired
	private UserService service = null;
	
	@GetMapping("/users")
	public List<User> getUsers() {
		return service.getUsers();
	}
	
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable int id) {
		User user =  service.getUser(id);
		if(user == null) {
			throw new UserNoFoundException("id-"+id);
		}
		
		return user;
	}
	
	/*@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		return service.saveUser(user);
	}*/
	
	
	/**
	 * Returns URI in the header
	 * @param user
	 * @return
	 */
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@RequestBody User user) {
		service.saveUser(user);
		URI location =  ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(user.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("/users/{id}")
	public User deleteUser(@PathVariable int id) {
		return service.deleteUser(id);
	}
}
