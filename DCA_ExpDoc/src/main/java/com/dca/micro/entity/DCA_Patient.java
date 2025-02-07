package com.dca.micro.entity;

import java.time.LocalDate;

public class DCA_Patient {

	private String patientId;

	private String firstName;
	private String lastName;
	private String gender;
	private String contact;
	private LocalDate DOB;
	private String emailId;
	private String userId;
	private String receptionistId;
	private String appointmentId;
	private String doctorId;

	private DCA_User user;

	private DCA_Receptionist receptionist;

	private DCA_Appointment appointment;

	private DCA_Doctor doctor;

	private byte[] medicalRecords;

	public DCA_Patient() {
		super();

	}

	public DCA_Patient(String firstName, String lastName, String gender, String contact, LocalDate dOB, String emailId,
			String userId, String receptionistId, String appointmentId, String doctorId, byte[] medicalRecords) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.contact = contact;
		DOB = dOB;
		this.emailId = emailId;
		this.userId = userId;
		this.receptionistId = receptionistId;
		this.appointmentId = appointmentId;
		this.doctorId = doctorId;
		this.medicalRecords = medicalRecords;
	}

	public DCA_Patient(String patientId, String firstName, String lastName, String gender, String contact,
			LocalDate dOB, String emailId, String userId, String receptionistId, String appointmentId, String doctorId,
			byte[] medicalRecords) {
		super();
		this.patientId = patientId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.contact = contact;
		DOB = dOB;
		this.emailId = emailId;
		this.userId = userId;
		this.receptionistId = receptionistId;
		this.appointmentId = appointmentId;
		this.doctorId = doctorId;
		this.medicalRecords = medicalRecords;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getReceptionistId() {
		return receptionistId;
	}

	public void setReceptionistId(String receptionistId) {
		this.receptionistId = receptionistId;
	}

	public String getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public DCA_User getUser() {
		return user;
	}

	public void setUser(DCA_User user) {
		this.user = user;
	}

	public DCA_Receptionist getReceptionist() {
		return receptionist;
	}

	public void setReceptionist(DCA_Receptionist receptionist) {
		this.receptionist = receptionist;
	}

	public DCA_Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(DCA_Appointment appointment) {
		this.appointment = appointment;
	}

	public DCA_Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(DCA_Doctor doctor) {
		this.doctor = doctor;
	}

	public byte[] getMedicalRecords() {
		return medicalRecords;
	}

	public void setMedicalRecords(byte[] medicalRecords) {
		this.medicalRecords = medicalRecords;
	}
}