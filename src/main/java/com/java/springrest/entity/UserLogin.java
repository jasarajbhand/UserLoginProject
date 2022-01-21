package com.java.springrest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_LOGIN_TABLE")
public class UserLogin {
	@Id
	@GeneratedValue
	private int userLoginId;
	private String userLoginName;
	private String userLoginPassword;
	
	public String getUserLoginName() {
		return userLoginName;
	}
	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName;
	}
	public String getUserLoginPassword() {
		return userLoginPassword;
	}
	public void setUserLoginPassword(String userLoginPassword) {
		this.userLoginPassword = userLoginPassword;
	}
	public int getUserLoginId() {
		return userLoginId;
	}
	public UserLogin(String userLoginName, String userLoginPassword) {
		super();
		this.userLoginName = userLoginName;
		this.userLoginPassword = userLoginPassword;
	}
	public UserLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserLogin [userLoginId=" + userLoginId + ", userLoginName=" + userLoginName + ", userLoginPassword="
				+ userLoginPassword + "]";
	}
	
	
	
	

}
