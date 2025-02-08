package com.dca.micro.PatientServiceImpl;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.dca.micro.Repository.PatientRepository;
import com.dca.micro.Service.PatientService;
import com.dca.micro.entity.DCA_Appointment;
import com.dca.micro.entity.DCA_Doctor;
import com.dca.micro.entity.DCA_Patient;
import com.dca.micro.entity.DCA_User;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	PatientRepository patientRepository;

	@Autowired
	RestTemplate restTemplate;

	@Override
	public DCA_Patient create(Map<String, Object> payload) {
		String firstName = (String) payload.get("firstName");
		String lastName = (String) payload.get("lastName");
		String contact = (String) payload.get("contact");
		String gender = (String) payload.get("gender");
		String address = (String) payload.get("address");
		String dob = (String) payload.get("dob");
		String password = (String) payload.get("password");
		String emailId = (String) payload.get("emailId");
		String medicalHistory = (String) payload.get("medicalHistory");
		
		LocalDate dt = ZonedDateTime.parse(dob).toLocalDate();
		

		DCA_Patient patient = new DCA_Patient(firstName, lastName, gender, contact, dt, emailId, address,
				medicalHistory);
		patient.setPatientId(UUID.randomUUID().toString());

		// Creating a new USER with role "patient" every time a new patient is registered
		DCA_User user = new DCA_User();
		user.setUserId(patient.getPatientId());
		user.setRole("patient");
		user.setEmailId(emailId);
		user.setPassword(password);

		restTemplate.postForObject("http://localhost:8083/user/", user, DCA_User.class);
		return patientRepository.save(patient);
	}

	@Override
	public List<DCA_Patient> getAllPatient() {

		return patientRepository.findAll();
	}

	public void updatePatient(DCA_Patient patient, String id) {
		patient.setPatientId(id);
		patientRepository.save(patient);

	}

	@Override
	public DCA_Patient getPatient(String id) {

		DCA_Patient patient = patientRepository.findById(id).get();

		try {
			String[] apptsLst = restTemplate.getForObject("http://localhost:8082/appointments/patient/" + id,
					String[].class);
			if (apptsLst == null || apptsLst.length == 0) {
				System.out.println("No appointments found for patient ID: " + id);
			} else {
				List<DCA_Doctor> dlst = new ArrayList<>();

				Arrays.asList(apptsLst).stream().forEach(dId -> {
					DCA_Doctor doctor = restTemplate.getForObject("http://localhost:8081/doctor/" + dId,
							DCA_Doctor.class);
					dlst.add(doctor);
				});

				patient.setDoctors(dlst);
			}
		} catch (RestClientException e) {
			System.out.println("Patient with ID " + id + " not found.");
		}

		return patient;
	}

	@Override
	public void deletePatient(String id) {
		patientRepository.deleteById(id);
	}

	@Override
	public void bookAppointment(String patientId, String doctorId) {
		DCA_Appointment appt = new DCA_Appointment();
		appt.setAppointmentDate(LocalDate.now());
		appt.setDoctorId(doctorId);
		appt.setPatientId(patientId);
		restTemplate.postForObject("http://localhost:8082/appointments", appt, DCA_Appointment.class);

	}

	@Override
	public DCA_Patient getPatientForDoctor(String patientId) {

		DCA_Patient patient = patientRepository.findById(patientId).get();
		return patient;
	}

//	@Override
//	public List<DCA_Patient> getPatientByDoctorId(String DocId) {
//		return patientRepository.findAllByDoctorId(DocId);
//	}
//
//	@Override
//	public List<DCA_Patient> getPatientByReceptionistId(String receptionistId) {
//		return patientRepository.findAllByReceptionistId(receptionistId);
//		
//	}
//	@Override
//	public List<DCA_Patient> getPatientByUserId(String userId){
//		return patientRepository.findAllByUserId(userId);
//	}
//
//	@Override
//	public List<DCA_Patient> getPatientByAppointmentId(String appointmentId){
//		return patientRepository.findAllByAppointmentId(appointmentId);
//	}
}