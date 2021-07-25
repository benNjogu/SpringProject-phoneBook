package com.keytech.domain;

public class User {

	private String name, phone, email, loginName;
	private int userId, role, loginStatus;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String name, String phone, String email, String loginName, int userId, int role, int loginStatus) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.loginName = loginName;
		this.userId = userId;
		this.role = role;
		this.loginStatus = loginStatus;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getLoginName() {
		return loginName;
	}
	
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public int getRole() {
		return role;
	}
	
	public void setRole(int role) {
		this.role = role;
	}
	
	public int getLoginStatus() {
		return loginStatus;
	}
	
	public void setLoginStatus(int loginStatus) {
		this.loginStatus = loginStatus;
	}  
	
	
}
