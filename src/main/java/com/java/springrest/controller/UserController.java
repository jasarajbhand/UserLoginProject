package com.java.springrest.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.java.springrest.entity.User;
import com.java.springrest.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userservice;
	
	// Mapping get welcome message
	@GetMapping("/")
	public String home() {
		
		return "Welcome to User Registration Home page";
	}
	
	//Mapping to add new user details
	@PostMapping("/add")
	public String addUser(@RequestBody User user) {
		userservice.save(user);
		return "User record save successfully";
		
	}
	
	//Mapping to search user details
	@GetMapping("/{userId}")
	public User searchUser(@PathVariable("userId") int userId) {
		Optional<User> userRecord =  userservice.findById(userId);
		return userRecord.orElseGet(null);
	}
	
	//Mapping to update user details
	@PutMapping("/{userId}")
	public User updateUser(@PathVariable("userId") int userId,@RequestBody User user) {
		Optional<User> userDetail = userservice.findById(userId);
		if (userDetail.isPresent()) {
			User user1 = new User();
			user1.setUserId(user.getUserId());
			user1.setUserFirstName(user.getUserFirstName());
			user1.setUserLastName(user.getUserLastName());
			user1.setUserAge(user.getUserAge());
			user1.setUserEmail(user.getUserEmail());
			user1.setUserGender(user.getUserGender());
			user1.setUserAddress(user.getUserAddress());
			user1.setUserMobileNo(user.getUserMobileNo());
			user1.setUserRole(user.getUserRole());
			user1.setUserPassword(user.getUserPassword());
			user1.setUserConfirmpassword(user.getUserConfirmpassword());
			userservice.save(user1);
			return user1;
			
	}
		 return null;	
	}
	
	
	//Mapping to delete user details
	@DeleteMapping("/{userId}")
	public String deleteUser(@PathVariable("userId") int userId) {
		userservice.deleteById(userId);
		return "successfully deleted";
	}
	
	//Mapping to GetAll user details
	@GetMapping("/getAll")
	public List<User> getAllUser(){
		return userservice.findAll();
	}
	
	
	

}
