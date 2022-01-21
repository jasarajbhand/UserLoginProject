package com.java.springrest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_INFO_MASTER")
public class User {
	
	@Id
	private int userId;
	private String userFirstName;
	private String userLastName;
	private int userAge;
	private String userEmail;
	private String userGender;
	private String userAddress;
	private long userMobileNo;
	private String userRole;
	private String userPassword;
	private String userConfirmpassword;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public long getUserMobileNo() {
		return userMobileNo;
	}
	public void setUserMobileNo(long userMobileNo) {
		this.userMobileNo = userMobileNo;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserConfirmpassword() {
		return userConfirmpassword;
	}
	public void setUserConfirmpassword(String userConfirmpassword) {
		this.userConfirmpassword = userConfirmpassword;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", userAge=" + userAge + ", userEmail=" + userEmail + ", userGender=" + userGender + ", userAddress="
				+ userAddress + ", userMobileNo=" + userMobileNo + ", userRole=" + userRole + ", userPassword="
				+ userPassword + ", userConfirmpassword=" + userConfirmpassword + "]";
	}
	public User(int userId, String userFirstName, String userLastName, int userAge, String userEmail, String userGender,
			String userAddress, long userMobileNo, String userRole, String userPassword, String userConfirmpassword) {
		super();
		this.userId = userId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userAge = userAge;
		this.userEmail = userEmail;
		this.userGender = userGender;
		this.userAddress = userAddress;
		this.userMobileNo = userMobileNo;
		this.userRole = userRole;
		this.userPassword = userPassword;
		this.userConfirmpassword = userConfirmpassword;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
