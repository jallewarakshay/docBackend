package com.dca.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "Doctor")
public class DCA_Doctor {

	@Id
	private String doctorId;

	private String fullname;
	private String email;
	private String contact;
	private String qualification;
	private String speciality;
	private String experience;
	private String gender;
	private String license;
	
	public DCA_Doctor() {
		// TODO Auto-generated constructor stub
	}
	

	@Lob
	private byte[] DoctorLicense;
	
	@Transient
	List<DCA_Patient> patients = new ArrayList<>();

	
	
	
	public DCA_Doctor(String fullname, String email, String contact, String qualification, String speciality,
			String experience, String gender,String license) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.contact = contact;
		this.speciality = speciality;
		this.qualification = qualification;
		this.experience = experience;
		this.gender = gender;
		this.license= license;
	}

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
		return speciality;
	}

	public void setSpecality(String specality) {
		this.speciality = specality;
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

	public byte[] getDoctorLicense() {
		return DoctorLicense;
	}

	public void setDoctorLicense(byte[] doctorLicense) {
		DoctorLicense = doctorLicense;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}
	

}
