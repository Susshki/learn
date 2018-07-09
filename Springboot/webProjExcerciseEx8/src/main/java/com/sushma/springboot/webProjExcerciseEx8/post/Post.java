package com.sushma.springboot.webProjExcerciseEx8.post;

public class Post {
	private int post_id;
	private String post_message;
	
	private static  int postId_Cnt = 0;	
	
	public Post(String post_message) {
		super();
		this.post_id = ++postId_Cnt;
		this.post_message = post_message;
	}
	
	
	/**
	 * @return the post_id
	 */
	public int getPost_id() {
		return post_id;
	}
	/**
	 * @param post_id the post_id to set
	 */
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	/**
	 * @return the post_message
	 */
	public String getPost_message() {
		return post_message;
	}
	/**
	 * @param post_message the post_message to set
	 */
	public void setPost_message(String post_message) {
		this.post_message = post_message;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Post [post_id=" + post_id + ", post_message=" + post_message + "]";
	}
	
	
}
