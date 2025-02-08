package com.dca.entity;
import java.time.LocalDate;

public class DCA_User {

	private String userId;
	private String userName;
	private String role;
	private LocalDate createdAt;
	private LocalDate lastUpdated;
	private String emailId;
	private String password;

	public DCA_User() {
	}

	public DCA_User(String userName, String role, String emailId, String password) {
		super();
		this.userName = userName;
		this.role = role;
		this.emailId = emailId;
		this.password = password;
	}

	protected void onCreate() {
		createdAt = LocalDate.now();
		lastUpdated = LocalDate.now();
	}

	protected void onUpdate() {
		lastUpdated = LocalDate.now();
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

	public LocalDate getLastUpdated() {
		return lastUpdated;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}