package com.sushma.springboot.webProjExcerciseEx8.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sushma.springboot.webProjExcerciseEx8.exception.ResourceNotFoundException;
import com.sushma.springboot.webProjExcerciseEx8.post.Post;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return service.getUsers();
	}
	
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable int id){
		return service.getUserById(id);
	}
	
	@GetMapping("/users/{id}/posts")
	public List<Post> retrieveAllPostsForUser(@PathVariable int id){
		List<Post> posts = service.retrieveAllPostsForUser(id);
		return posts;
	}
	
	@PostMapping("/users/{id}/posts")
	public User createPostForUser(@PathVariable int id, @RequestBody String message) {
		User user = service.createPostForUser(id, message);
		 if(user == null) {
			 throw new ResourceNotFoundException("10001", "Id:"+id+" is not found");
		 }
		 
		 return user;
	}

	//Retrieve details of a post
	@GetMapping("users/{id}/posts/{post_id}")
	public Post getPostDetails(@PathVariable int id, @PathVariable int post_id ) {
		Post post = service.getPostDetails(id, post_id);
		if(post == null) {
			throw new ResourceNotFoundException("10002", "post not found"); 
		}
		
		return post;
	}
	
	@DeleteMapping("users/{id}")
	public User deleteUser(@PathVariable int id) {
		return service.deleteUserById(id);
	}
	
	
}
