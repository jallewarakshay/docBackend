package com.dca.micro.entity;

import java.time.LocalDate;

public class DCA_User {

	private String userId;
	private String userName;
	private String role;
	private LocalDate createdAt;
	private LocalDate lastUpdated;
	private String email;
	private String password;

	public DCA_User() {
	}

	public DCA_User(String userName, String role, LocalDate createdAt, LocalDate lastUpdated, String email,
			String password) {
		super();
		this.userName = userName;
		this.role = role;
		this.createdAt = createdAt;
		this.lastUpdated = lastUpdated;
		this.email = email;
		this.password = password;
	}

	public DCA_User(String userId, String userName, String role, LocalDate createdAt, LocalDate lastUpdated,
			String email, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.role = role;
		this.createdAt = createdAt;
		this.lastUpdated = lastUpdated;
		this.email = email;
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDate getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(LocalDate lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}