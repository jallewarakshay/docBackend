package com.dca.entity;

import java.sql.Date;

public class DCA_Patient {
	private String patient_Id;
	private String firstName;
	private String lastName;
	private String gender;
	private String user_Id;
	private String email_Id;
	private String receptionist_Id;
	private String appointment_Id;
	private String doctor_Id;
	private String contact;
	private Date DOB;
	private byte[] medicalRecords;
	
	
	private DCA_User user;
	private DCA_Appointment appointment;
	private DCA_Receptionist receptionist;
	
	
	public String getPatient_Id() {
		return patient_Id;
	}
	public void setPatient_Id(String patient_Id) {
		this.patient_Id = patient_Id;
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
	public String getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}
	public String getEmail_Id() {
		return email_Id;
	}
	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}
	public String getReceptionist_Id() {
		return receptionist_Id;
	}
	public void setReceptionist_Id(String receptionist_Id) {
		this.receptionist_Id = receptionist_Id;
	}
	public String getAppointment_Id() {
		return appointment_Id;
	}
	public void setAppointment_Id(String appointment_Id) {
		this.appointment_Id = appointment_Id;
	}
	public String getDoctor_Id() {
		return doctor_Id;
	}
	public void setDoctor_Id(String doctor_Id) {
		this.doctor_Id = doctor_Id;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public byte[] getMedicalRecords() {
		return medicalRecords;
	}
	public void setMedicalRecords(byte[] medicalRecords) {
		this.medicalRecords = medicalRecords;
	}
	public DCA_Patient(String patient_Id, String firstName, String lastName, String gender, String user_Id,
			String email_Id, String receptionist_Id, String appointment_Id, String doctor_Id, String contact, Date dOB,
			byte[] medicalRecords) {
		super();
		this.patient_Id = patient_Id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.user_Id = user_Id;
		this.email_Id = email_Id;
		this.receptionist_Id = receptionist_Id;
		this.appointment_Id = appointment_Id;
		this.doctor_Id = doctor_Id;
		this.contact = contact;
		DOB = dOB;
		this.medicalRecords = medicalRecords;
	}
	public DCA_Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DCA_Patient(String firstName, String lastName, String gender, String user_Id, String email_Id,
			String contact, Date dOB, byte[] medicalRecords) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.user_Id = user_Id;
		this.email_Id = email_Id;
		this.contact = contact;
		DOB = dOB;
		this.medicalRecords = medicalRecords;
	}
	
	
	

}
