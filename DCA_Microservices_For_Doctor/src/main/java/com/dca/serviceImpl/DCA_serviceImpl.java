package com.dca.serviceImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.dca.entity.DCA_Appointment;
import com.dca.entity.DCA_Doctor;
import com.dca.entity.DCA_Patient;
import com.dca.entity.DCA_User;
import com.dca.repo.DCA_repo;
import com.dca.service.DCA_service;



@Service
public class DCA_serviceImpl implements DCA_service {

	
	@Autowired
	DCA_repo dca_repo;
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public DCA_Doctor create_Doctor(Map<String,Object> payload) {
		String fullname=(String)payload.get("fullname");
		String emailId=(String)payload.get("emailId");
		String password=(String) payload.get("password");
		String contact=(String)payload.get("contact");
		String speciality=(String)payload.get("speciality");
		String qualification=(String)payload.get("qualification");
		String experience=(String)payload.get("experience");
		String gender=(String)payload.get("gender");
		String license=(String)payload.get("license");
		
		
		DCA_Doctor doctor= new DCA_Doctor(fullname,emailId, contact, qualification, speciality,experience,gender,license);
		doctor.setDoctorId(UUID.randomUUID().toString());
		
		//for adding doctor in user 
		DCA_User user= new DCA_User();
		user.setUserId(doctor.getDoctorId());
		user.setRole("doctor");
		user.setEmailId(emailId);
		user.setPassword(password);
		
		restTemplate.postForObject("http://localhost:8083/user/", user, DCA_User.class);
		return dca_repo.save(doctor);
	}
	
	@Override
	public void uploadLicence(String doctorId,MultipartFile file) throws IOException {
		Optional<DCA_Doctor> optionalDoctor = dca_repo.findById(doctorId);
        if (optionalDoctor.isPresent()) {
            DCA_Doctor doctor = optionalDoctor.get();
            doctor.setDoctorLicense(file.getBytes());
            dca_repo.save(doctor);
        } else {
            throw new RuntimeException("Doctor not found with ID: " + doctorId);
        }
        
	}

	@Override
	public void update_Doctor(DCA_Doctor doctor, String id) {
		doctor.setDoctorId(id);
		dca_repo.save(doctor);
	}

	@Override
	public void delete_Doctor(String id) {
		dca_repo.deleteById(id);
	}

	@Override
	public DCA_Doctor get_Doctor(String id) {
			DCA_Doctor doctor=dca_repo.findById(id).get();
			List<DCA_Patient> plst = new ArrayList<>();

			DCA_Appointment[] apptLst=restTemplate.getForObject("http://localhost:8082/appointments/doctor/" + id, DCA_Appointment[].class);
			
			Arrays.asList(apptLst).stream().forEach(appt->{
				DCA_Patient patient=restTemplate.getForObject("http://localhost:8089/patient/"+appt.getPatient_id(),DCA_Patient.class);
			plst.add(patient);			
			});
			doctor.setPatients(plst);
		return doctor;
	}

	@Override
	public List<DCA_Doctor> getAllDoctor() {

		return dca_repo.findAll();
	}
}
