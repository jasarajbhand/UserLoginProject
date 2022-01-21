package com.java.springrest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.springrest.entity.User;
import com.java.springrest.entity.UserRole;
import com.java.springrest.service.UserRoleService;
import com.java.springrest.service.UserService;

@RestController
public class UserRoleController {
	
	@Autowired
	UserService userService;
	@Autowired
	UserRoleService roleService;
	
	
	// Mapping to change role
	@PostMapping("/role")
	public String changeRole(@RequestBody UserRole userRole) {
		String result = null;
		roleService.save(userRole);
		List<User> userList = new ArrayList<User>(userService.findAll());
		for(User user1:userList) {
			if(user1.getUserFirstName().equals(userRole.getUserName())) {
				if(user1.getUserRole().equals(userRole.getExistingRole())) {
					user1.setUserRole(userRole.getNewRole());
					userService.save(user1);
					result = "User"+user1.getUserFirstName()+"role changed to "+user1.getUserRole()+"from"+userRole.getExistingRole()+"successfully";
				}else
					
					result = "Existing role not matched";		
			}
		
			else
				result = "User name not matched";
			break;
		}
		return result;
	}

}
