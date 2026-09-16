package com.example.microservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
	
	private int userId;
	private String userName;
	
	private Post post;
	private Notifications notifications;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	public Notifications getNotifications() {
		return notifications;
	}
	public void setNotifications(Notifications notifications) {
		this.notifications = notifications;
	}
	
	public Users() {
		
	}
	
	public Users(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
		
	}
	
	public Users(int userId, String userName, Post post, Notifications notifications) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.post = post;
		this.notifications = notifications;
	}

	


	

}
