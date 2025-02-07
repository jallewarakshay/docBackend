package com.dca.micro.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "treatment")
public class DCA_Treatment {
	
	@Id
	private String TreatmentId;

	private String PatientId;

	private String DoctorId;
	private String Description;

	private byte[] prescription;

	private DCA_Patient patient;
	private DCA_Doctor doctor;
	public DCA_Treatment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DCA_Treatment(String patientId, String doctorId, String description, byte[] prescription) {
		super();
		PatientId = patientId;
		DoctorId = doctorId;
		Description = description;
		this.prescription = prescription;
	}
	public DCA_Treatment(String treatmentId, String patientId, String doctorId, String description,
			byte[] prescription) {
		super();
		TreatmentId = treatmentId;
		PatientId = patientId;
		DoctorId = doctorId;
		Description = description;
		this.prescription = prescription;
	}
	public String getTreatmentId() {
		return TreatmentId;
	}
	public void setTreatmentId(String treatmentId) {
		TreatmentId = treatmentId;
	}
	public String getPatientId() {
		return PatientId;
	}
	public void setPatientId(String patientId) {
		PatientId = patientId;
	}
	public String getDoctorId() {
		return DoctorId;
	}
	public void setDoctorId(String doctorId) {
		DoctorId = doctorId;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public byte[] getPrescription() {
		return prescription;
	}
	public void setPrescription(byte[] prescription) {
		this.prescription = prescription;
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
