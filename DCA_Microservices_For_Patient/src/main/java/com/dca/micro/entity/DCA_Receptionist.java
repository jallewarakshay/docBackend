package com.dca.micro.entity;

import java.time.LocalDate;
import java.util.List;


public class DCA_Receptionist {
	
	
	private String receptionist_id;
	private String name;
	private String email;
	private String contact;
	private String gender;
	private LocalDate dob;
	private String doctor_id;
	private String patient_id;
	private String treatement_id;
	private String user_id;
	private String appoinment_id;
	
	
	private DCA_Doctor dca_doctor;

	private DCA_Patient dca_patient;
	
	private DCA_User dca_user;
	
	private DCA_Treatment dca_treatement;
	
	private  DCA_Appointment appointment;
	
	public DCA_Receptionist() {
		super();
	}

	public DCA_Receptionist(String receptionist_id, String name, String email, String contact, String gender,
			LocalDate dob, DCA_Doctor dca_doctor, DCA_Patient dca_patient, DCA_User dca_user,
			DCA_Treatment dca_treatement, DCA_Appointment appointment) {
		super();
		this.receptionist_id = receptionist_id;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.gender = gender;
		this.dob = dob;
		this.dca_doctor = dca_doctor;
		this.dca_patient = dca_patient;
		this.dca_user = dca_user;
		this.dca_treatement = dca_treatement;
		this.appointment = appointment;
	}

	public DCA_Receptionist(String name, String email, String contact, String gender, LocalDate dob,
			DCA_Doctor dca_doctor, DCA_Patient dca_patient, DCA_User dca_user, DCA_Treatment dca_treatement,
			DCA_Appointment appointment) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.gender = gender;
		this.dob = dob;
		this.dca_doctor = dca_doctor;
		this.dca_patient = dca_patient;
		this.dca_user = dca_user;
		this.dca_treatement = dca_treatement;
		this.appointment = appointment;
	}

	public DCA_Receptionist(String name, String email, String contact, String gender, LocalDate dob) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.gender = gender;
		this.dob = dob;
	}

	public String getReceptionist_id() {
		return receptionist_id;
	}

	public void setReceptionist_id(String receptionist_id) {
		this.receptionist_id = receptionist_id;
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