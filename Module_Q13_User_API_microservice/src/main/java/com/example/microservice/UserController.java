package com.example.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public Users getUsers(@PathVariable("userId") int userId) {
		
		Users user1=new Users(userId, "ABC");
		
		Post posts=restTemplate.getForObject("http://localhost:3000/posts/1", Post.class);
		user1.setPost(posts);
		
		
		Notifications notifications=restTemplate.getForObject("http://localhost:5000/notifications/1", Notifications.class);
		user1.setNotifications(notifications);
		
		return user1;
		
	}
}
