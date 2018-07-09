package com.sushma.springboot.webProjExcerciseEx8.user;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sushma.springboot.webProjExcerciseEx8.post.Post;

@Component
public class UserDao {
	
	private static List<User> users = new ArrayList<User>();
	private static int userCnt = 3;
	
	static {
		users.add(new User(1, "Sushma"));
		users.add(new User(2, "Kiran"));
		users.add(new User(3, "Kumara Swamy"));
	}

	public List<User> getUsers() {
		return users;
	}
	
	public User getUser(int id) {
		for(User user: users) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	public List<Post> retrieveAllPostsForUser(int id) {
		for(User user : users) {
			if(user.getId() == id) {
				return user.getPosts();
			}
		}
		return null;
	}

	public User createPostForUser(int id, String msg) {
		for(User user : users) {
			if(user.getId() == id) {
				List<Post> posts = user.getPosts();
				posts.add(new Post(msg));
				return user;
			}
		}
		return null;
	}

	public Post getPostDetails(int id, int post_id) {
		for(User user: users) {
			if(user.getId() == id) {			
				for(Post post : user.getPosts()) {
					if(post.getPost_id() == post_id) {

						return post;
					}
				}
				return null;
			}
		}
		
		return null;
	}

	public User deleteUserById(int id) {
		/*for(User user : users) {
			if(user.getId() == id) {
				users.remove(user);
				return user;
			}
		}
		return null;*/
		
		//Use Iterator to avoid in between request thread
		
		Iterator<User> iterator = users.iterator();
		while(iterator.hasNext()) {
			User user = iterator.next();
			if(user.getId() == id) {
				users.remove(user);
				return user;
			}
		}
		return null;
	}

}
