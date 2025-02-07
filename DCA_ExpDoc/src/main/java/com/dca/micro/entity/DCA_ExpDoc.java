package com.dca.micro.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class DCA_ExpDoc {
	
	@Id
	private String experienceId;
	private String hospitalName;
	private LocalDate startFrom;
	private LocalDate endTo;
	private String doctorId;
	
	@Transient
	private DCA_Doctor doctor; 
	
	@Lob
	private byte[] expLetter;

	public DCA_ExpDoc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DCA_ExpDoc(String hospitalName, LocalDate startFrom, LocalDate endTo, String doctorId, byte[] expLetter) {
		super();
		this.hospitalName = hospitalName;
		this.startFrom = startFrom;
		this.endTo = endTo;
		this.doctorId = doctorId;
		this.expLetter = expLetter;
	}

	public DCA_ExpDoc(String experienceId, String hospitalName, LocalDate startFrom, LocalDate endTo, String doctorId,
			byte[] expLetter) {
		super();
		this.experienceId = experienceId;
		this.hospitalName = hospitalName;
		this.startFrom = startFrom;
		this.endTo = endTo;
		this.doctorId = doctorId;
		this.expLetter = expLetter;
	}

	public String getExperienceId() {
		return experienceId;
	}

	public void setExperienceId(String experienceId) {
		this.experienceId = experienceId;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public LocalDate getStartFrom() {
		return startFrom;
	}

	public void setStartFrom(LocalDate startFrom) {
		this.startFrom = startFrom;
	}

	public LocalDate getEndTo() {
		return endTo;
	}

	public void setEndTo(LocalDate endTo) {
		this.endTo = endTo;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public DCA_Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(DCA_Doctor doctor) {
		this.doctor = doctor;
	}

	public byte[] getExpLetter() {
		return expLetter;
	}

	public void setExpLetter(byte[] expLetter) {
		this.expLetter = expLetter;
	}
}