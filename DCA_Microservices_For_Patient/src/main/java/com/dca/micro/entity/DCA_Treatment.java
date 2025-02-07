package com.dca.micro.entity;

public class DCA_Treatment {

	private String Treatment_Id;

	private String Patient_Id;

	private String Doctor_Id;
	private String Description;

	private DCA_Patient patient;
	private DCA_Doctor doctor;

	private byte[] prescription;

	public DCA_Treatment(String patient_Id, String doctor_Id, String description, byte[] prescription) {
		super();
		Patient_Id = patient_Id;
		Doctor_Id = doctor_Id;
		Description = description;
		this.prescription = prescription;
	}

	public DCA_Treatment(String treatment_Id, String patient_Id, String doctor_Id, String description,
			byte[] prescription) {
		super();
		Treatment_Id = treatment_Id;
		Patient_Id = patient_Id;
		Doctor_Id = doctor_Id;
		Description = description;
		this.prescription = prescription;
	}

	public String getTreatment_Id() {
		return Treatment_Id;
	}

	public void setTreatment_Id(String treatment_Id) {
		Treatment_Id = treatment_Id;
	}

	public String getPatient_Id() {
		return Patient_Id;
	}

	public void setPatient_Id(String patient_Id) {
		Patient_Id = patient_Id;
	}

	public String getDoctor_Id() {
		return Doctor_Id;
	}

	public void setDoctor_Id(String doctor_Id) {
		Doctor_Id = doctor_Id;
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

	public DCA_Treatment() {
		super();
	}

}