package com.dca.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class DCA_Appointment {

private String appointment_id;
	

	private String receptionist_id;
	private String patient_id;
	private String doctor_id;
	private LocalDate appointment_date;
	private String status;
	private LocalTime duration;
	
	
	private DCA_Patient patient;
	private DCA_Receptionist receptionist;
	
	
	public String getAppointment_id() {
		return appointment_id;
	}
	public void setAppointment_id(String appointment_id) {
		this.appointment_id = appointment_id;
	}
	public String getReceptionist_id() {
		return receptionist_id;
	}
	public void setReceptionist_id(String receptionist_id) {
		this.receptionist_id = receptionist_id;
	}
	public String getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}
	public String getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(String doctor_id) {
		this.doctor_id = doctor_id;
	}
	public LocalDate getAppointment_date() {
		return appointment_date;
	}
	public void setAppointment_date(LocalDate appointment_date) {
		this.appointment_date = appointment_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalTime getDuration() {
		return duration;
	}
	public void setDuration(LocalTime duration) {
		this.duration = duration;
	}
	public DCA_Appointment(String appointment_id, String receptionist_id, String patient_id, String doctor_id,
			LocalDate appointment_date, String status, LocalTime duration) {
		super();
		this.appointment_id = appointment_id;
		this.receptionist_id = receptionist_id;
		this.patient_id = patient_id;
		this.doctor_id = doctor_id;
		this.appointment_date = appointment_date;
		this.status = status;
		this.duration = duration;
	}
	public DCA_Appointment() {
		super();
	
	}
	public DCA_Appointment(LocalDate appointment_date, String status, LocalTime duration) {
		super();
		this.appointment_date = appointment_date;
		this.status = status;
		this.duration = duration;
	}
	
}
