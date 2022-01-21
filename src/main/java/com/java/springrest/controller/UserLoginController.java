package com.java.springrest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.springrest.entity.User;
import com.java.springrest.entity.UserLogin;
import com.java.springrest.service.UserLoginService;
import com.java.springrest.service.UserService;

@RestController
public class UserLoginController {
	
	@Autowired
	UserLoginService loginservice;
	
	@Autowired
	UserService service;
	
	@PostMapping("/login")
	public String getLogin(@RequestBody UserLogin loginUser) {
		loginservice.save(loginUser);
		String result = "invalid credintial";
		List<User> userList =null;
		userList = new ArrayList<User>( service.findAll());
		for(User user1:userList) {		
		if(user1.getUserFirstName().equals(loginUser.getUserLoginName()) && user1.getUserPassword().equals(loginUser.getUserLoginPassword()))
			result =  "User Authentication successfull, Welcome Mr/Mrs - "+loginUser.getUserLoginName();
		
			}	
		return result; 
	}

}
