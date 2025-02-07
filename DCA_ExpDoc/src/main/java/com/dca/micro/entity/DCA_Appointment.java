package com.dca.micro.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class DCA_Appointment {

	private String appointmentId;
	
	
	private LocalDate appointmentDate;
	private String status;
	private LocalTime duration;
	
    private String receptionistId;
	
	private String patientId;

	private String doctorId;
	
	private DCA_Receptionist receptionist;
	
	private DCA_Patient patient;
	
	private DCA_Doctor doctor;
	
	public DCA_Appointment() {
		super();
		
	}

	public DCA_Appointment(LocalDate appointmentDate, String status, LocalTime duration, String receptionistId,
			String patientId, String doctorId) {
		super();
		this.appointmentDate = appointmentDate;
		this.status = status;
		this.duration = duration;
		this.receptionistId = receptionistId;
		this.patientId = patientId;
		this.doctorId = doctorId;
	}

	public DCA_Appointment(String appointmentId, LocalDate appointmentDate, String status, LocalTime duration,
			String receptionistId, String patientId, String doctorId) {
		super();
		this.appointmentId = appointmentId;
		this.appointmentDate = appointmentDate;
		this.status = status;
		this.duration = duration;
		this.receptionistId = receptionistId;
		this.patientId = patientId;
		this.doctorId = doctorId;
	}

	public String getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}

	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
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

	public String getReceptionistId() {
		return receptionistId;
	}

	public void setReceptionistId(String receptionistId) {
		this.receptionistId = receptionistId;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public DCA_Receptionist getReceptionist() {
		return receptionist;
	}

	public void setReceptionist(DCA_Receptionist receptionist) {
		this.receptionist = receptionist;
	}

	public DCA_Patient getPatient() {
		return patient;
	}

	public void setPatient(DCA_Patient patient) {
		this.patient = patient;
	}

	public DCA_Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(DCA_Doctor doctor) {
		this.doctor = doctor;
	}
}