package com.sushma.springboot.webProjExcerciseEx8.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sushma.springboot.webProjExcerciseEx8.post.Post;

@Component
public class UserService {

	@Autowired
	private UserDao dao;
	
	public List<User> getUsers() {
		return dao.getUsers();
	}
	
	public User getUser(int id) {
		return dao.getUser(id);
	}

	public List<Post> retrieveAllPostsForUser(int id) {
		return dao.retrieveAllPostsForUser(id);		
	}

	public User getUserById(int id) {
		return dao.getUser(id);
	}

	public User createPostForUser(int id, String msg) {
		return dao.createPostForUser(id, msg);
	}

	public Post getPostDetails(int id, int post_id) {
		return dao.getPostDetails(id, post_id);
		
	}

	public User deleteUserById(int id) {
		return dao.deleteUserById(id);
		
	}

}
