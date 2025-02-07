package com.dca.micro.entity;

import java.util.List;

public class DCA_Doctor {

	private String doctorId;

	private String fullname;
	private String email;
	private String contact;
	private String qualification;
	private String specality;
	private String experience;
	private String gender;
	private String experience_id;

	private byte[] DoctorLicense;
	
	List<DCA_Patient> patients;
	
	public List<DCA_Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<DCA_Patient> patients) {
		this.patients = patients;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public byte[] getDoctorLicense() {
		return DoctorLicense;
	}

	public void setDoctorLicense(byte[] doctorLicense) {
		DoctorLicense = doctorLicense;
	}
	
	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
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

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSpecality() {
		return specality;
	}

	public void setSpecality(String specality) {
		this.specality = specality;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getExperience_id() {
		return experience_id;
	}

	public void setExperience_id(String experience_id) {
		this.experience_id = experience_id;
	}


	public byte[] getBlobDoctor() {
		return DoctorLicense;
	}

	public void setBlobDoctor(byte[] blobDoctor) {
		this.DoctorLicense = blobDoctor;
	}



}