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
	private String experienceId;

	private byte[] blobDoctor;

	private String userId;
	private String patientId;
	private String appointmentId;
	private String receptionistId;

	private DCA_User user;

	private DCA_Appointment appointment;

	private DCA_Patient patient;

	private DCA_Receptionist receptionist;
	
	private DCA_ExpDoc expDoc;

	public DCA_Doctor() {
		super();
	}

	public DCA_Doctor(String fullname, String email, String contact, String qualification, String specality,
			String experience, String gender, String experienceId, byte[] blobDoctor, String userId, String patientId,
			String appointmentId, String receptionistId) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.contact = contact;
		this.qualification = qualification;
		this.specality = specality;
		this.experience = experience;
		this.gender = gender;
		this.experienceId = experienceId;
		this.blobDoctor = blobDoctor;
		this.userId = userId;
		this.patientId = patientId;
		this.appointmentId = appointmentId;
		this.receptionistId = receptionistId;
	}

	public DCA_Doctor(String doctorid, String fullname, String email, String contact, String qualification,
			String specality, String experience, String gender, String experienceId, byte[] blobDoctor, String userId,
			String patientId, String appointmentId, String receptionistId) {
		super();
		this.doctorid = doctorid;
		this.fullname = fullname;
		this.email = email;
		this.contact = contact;
		this.qualification = qualification;
		this.specality = specality;
		this.experience = experience;
		this.gender = gender;
		this.experienceId = experienceId;
		this.blobDoctor = blobDoctor;
		this.userId = userId;
		this.patientId = patientId;
		this.appointmentId = appointmentId;
		this.receptionistId = receptionistId;
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

	public String getExperienceId() {
		return experienceId;
	}

	public void setExperienceId(String experienceId) {
		this.experienceId = experienceId;
	}

	public byte[] getBlobDoctor() {
		return blobDoctor;
	}

	public void setBlobDoctor(byte[] blobDoctor) {
		this.blobDoctor = blobDoctor;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getReceptionistId() {
		return receptionistId;
	}

	public void setReceptionistId(String receptionistId) {
		this.receptionistId = receptionistId;
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