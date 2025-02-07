package com.dca.micro.entity;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class DCA_User {	
	
	@Id
	private String userId;
	private String userName;
	private String role;
	private LocalDate createdAt=LocalDate.now();
	private LocalDate lastUpdated=LocalDate.now();
	private String emailId;
	private String password;
	
	public DCA_User() {		
	}
	public DCA_User(String userName, String role, String emailId) {
		super();
		this.userName = userName;
		this.role = role;
		this.emailId = emailId;
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
