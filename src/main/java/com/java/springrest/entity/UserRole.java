package com.java.springrest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_ROLE")
public class UserRole {
	
	@Id
	@GeneratedValue
	private int userRoleId;
	private String userName;
	private String existingRole;
	private String newRole;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getExistingRole() {
		return existingRole;
	}
	public void setExistingRole(String existingRole) {
		this.existingRole = existingRole;
	}
	public String getNewRole() {
		return newRole;
	}
	public void setNewRole(String newRole) {
		this.newRole = newRole;
	}
	public int getUserRoleId() {
		return userRoleId;
	}
	public UserRole(String userName, String existingRole, String newRole) {
		super();
		this.userName = userName;
		this.existingRole = existingRole;
		this.newRole = newRole;
	}
	public UserRole() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserRole [userRoleId=" + userRoleId + ", userName=" + userName + ", existingRole=" + existingRole
				+ ", newRole=" + newRole + "]";
	}

	
	
	
	
	

}
