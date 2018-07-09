package com.sushma.springboot.webProjExcerciseEx8.user;

import java.util.ArrayList;
import java.util.List;

import com.sushma.springboot.webProjExcerciseEx8.post.Post;

public class User {
	
	private int id;
	private String name;
	private List<Post> posts = new ArrayList<Post>();	
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @return the posts
	 */
	public List<Post> getPosts() {
		return posts;
	}


	/**
	 * @param posts the posts to set
	 */
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", posts=" + posts + "]";
	}
}
