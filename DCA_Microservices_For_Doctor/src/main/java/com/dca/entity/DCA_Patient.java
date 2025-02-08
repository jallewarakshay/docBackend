package com.dca.entity;

import java.time.LocalDate;


import jakarta.persistence.Lob;

public class DCA_Patient {
	private String patientId;

	private String firstName;
	private String lastName;
	private String gender;
	private String contact;
	private LocalDate DOB;
	private String emailId;
	private String address;
	private String medicalHistory;

	@Lob
	private byte[] medicalRecords;
	
	
	public DCA_Patient() {
		// TODO Auto-generated constructor stub
	}

	public DCA_Patient(String firstName, String lastName, String gender, String contact, LocalDate dOB, String emailId,
			String address, String medicalHistory) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.contact = contact;
		DOB = dOB;
		this.emailId = emailId;
		this.address = address;
		this.medicalHistory = medicalHistory;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public byte[] getMedicalRecords() {
		return medicalRecords;
	}

	public void setMedicalRecords(byte[] medicalRecords) {
		this.medicalRecords = medicalRecords;
	}

	public String getMedicalHistory() {
		return medicalHistory;
	}

	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
