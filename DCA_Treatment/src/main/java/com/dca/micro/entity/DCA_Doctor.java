package com.dca.micro.entity;

public class DCA_Doctor {

	private String doctorid;

	private String fullname;
	private String email;
	private String contact;
	private String qualification;
	private String specality;
	private String experience;
	private String gender;
	private String experience_id;

	private byte[] blobDoctor;

	private String user_id;
	private String patient_id;
	private String appointment_id;
	private String receptionist_id;

	private DCA_User user;

	private DCA_Appointment appointment;

	private DCA_Patient patient;

	private DCA_Receptionist receptionist;
	
	private DCA_ExpDoc expDoc;

	public DCA_Doctor() {
		super();
	}

	public DCA_Doctor(String doctorid, String fullname, String email, String contact, String qualification,
			String specality, String experience, String gender, String experience_id, String hospital_name,
			String start_from, String end_to, byte exp_letter, byte[] blobDoctor, String user_id, String patient_id,
			String appointment_id, String receptionist_id, DCA_User user, DCA_Appointment appointment,
			DCA_Patient patient, DCA_Receptionist receptionist) {
		super();
		this.doctorid = doctorid;
		this.fullname = fullname;
		this.email = email;
		this.contact = contact;
		this.qualification = qualification;
		this.specality = specality;
		this.experience = experience;
		this.gender = gender;
		this.experience_id = experience_id;
		this.blobDoctor = blobDoctor;
		this.user_id = user_id;
		this.patient_id = patient_id;
		this.appointment_id = appointment_id;
		this.receptionist_id = receptionist_id;
		this.user = user;
		this.appointment = appointment;
		this.patient = patient;
		this.receptionist = receptionist;
	}

	public String getDoctorid() {
		return doctorid;
	}

	public void setDoctorid(String doctorid) {
		this.doctorid = doctorid;
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
		return blobDoctor;
	}

	public void setBlobDoctor(byte[] blobDoctor) {
		this.blobDoctor = blobDoctor;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}

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

	public DCA_User getUser() {
		return user;
	}

	public void setUser(DCA_User user) {
		this.user = user;
	}

	public DCA_Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(DCA_Appointment appointment) {
		this.appointment = appointment;
	}

	public DCA_Patient getPatient() {
		return patient;
	}

	public void setPatient(DCA_Patient patient) {
		this.patient = patient;
	}

	public DCA_Receptionist getReceptionist() {
		return receptionist;
	}

	public void setReceptionist(DCA_Receptionist receptionist) {
		this.receptionist = receptionist;
	}

	public DCA_ExpDoc getExpDoc() {
		return expDoc;
	}

	public void setExpDoc(DCA_ExpDoc expDoc) {
		this.expDoc = expDoc;
	}

}