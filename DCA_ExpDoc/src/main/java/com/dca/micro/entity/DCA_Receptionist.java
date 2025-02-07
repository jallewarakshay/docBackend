package com.dca.micro.entity;

import java.time.LocalDate;
import java.util.List;

public class DCA_Receptionist {

	private String receptionistId;
	private String name;
	private String email;
	private String contact;
	private String gender;
	private LocalDate dob;
	private String doctorId;
	private String patientId;
	private String treatementId;
	private String userId;
	private String appointmentId;
	
	private DCA_Doctor dca_doctor;

	private DCA_Patient dca_patient;

	private DCA_User dca_user;

	private DCA_Treatment dca_treatement;

	private DCA_Appointment appointment;
	
	public DCA_Receptionist() {
		super();
	}

	public DCA_Receptionist(String name, String email, String contact, String gender, LocalDate dob, String doctorId,
			String patientId, String treatementId, String userId, String appointmentId) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.gender = gender;
		this.dob = dob;
		this.doctorId = doctorId;
		this.patientId = patientId;
		this.treatementId = treatementId;
		this.userId = userId;
		this.appointmentId = appointmentId;
	}

	public DCA_Receptionist(String receptionistId, String name, String email, String contact, String gender,
			LocalDate dob, String doctorId, String patientId, String treatementId, String userId,
			String appointmentId) {
		super();
		this.receptionistId = receptionistId;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.gender = gender;
		this.dob = dob;
		this.doctorId = doctorId;
		this.patientId = patientId;
		this.treatementId = treatementId;
		this.userId = userId;
		this.appointmentId = appointmentId;
	}

	public String getReceptionistId() {
		return receptionistId;
	}

	public void setReceptionistId(String receptionistId) {
		this.receptionistId = receptionistId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getTreatementId() {
		return treatementId;
	}

	public void setTreatementId(String treatementId) {
		this.treatementId = treatementId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}

	public DCA_Doctor getDca_doctor() {
		return dca_doctor;
	}

	public void setDca_doctor(DCA_Doctor dca_doctor) {
		this.dca_doctor = dca_doctor;
	}

	public DCA_Patient getDca_patient() {
		return dca_patient;
	}

	public void setDca_patient(DCA_Patient dca_patient) {
		this.dca_patient = dca_patient;
	}

	public DCA_User getDca_user() {
		return dca_user;
	}

	public void setDca_user(DCA_User dca_user) {
		this.dca_user = dca_user;
	}

	public DCA_Treatment getDca_treatement() {
		return dca_treatement;
	}

	public void setDca_treatement(DCA_Treatment dca_treatement) {
		this.dca_treatement = dca_treatement;
	}

	public DCA_Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(DCA_Appointment appointment) {
		this.appointment = appointment;
	}
}