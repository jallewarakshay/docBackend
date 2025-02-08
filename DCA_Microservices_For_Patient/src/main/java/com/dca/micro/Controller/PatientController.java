package com.dca.micro.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dca.micro.Service.PatientService;
import com.dca.micro.entity.DCA_Patient;

@RestController
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	PatientService patientService;

	@CrossOrigin(origins="http://localhost:3000")
	@PostMapping("/")
	public ResponseEntity<DCA_Patient> create(@RequestBody Map<String, Object> patient) {
		return ResponseEntity.status(HttpStatus.CREATED).body(patientService.create(patient));
	}
	
	@CrossOrigin(origins="http://localhost:3000")
	@GetMapping("/")
	public ResponseEntity<List<DCA_Patient>> getallPatient() {
		return ResponseEntity.status(HttpStatus.OK).body(patientService.getAllPatient());
	}

	@GetMapping("/{patientId}")
	public ResponseEntity<DCA_Patient> getPatient(@PathVariable String patientId) {
		return ResponseEntity.status(HttpStatus.FOUND).body(patientService.getPatient(patientId));
	}

	@PutMapping("/{patientId}")
	public ResponseEntity<Void> updatePatient(@RequestBody DCA_Patient dca_Patient, @PathVariable String patientId) {
		patientService.updatePatient(dca_Patient, patientId);
		return ResponseEntity.status(HttpStatus.OK).build();

	}

	@DeleteMapping("/{patientId}")
	public ResponseEntity<Void> deletePatient(@PathVariable String patientId) {
		patientService.deletePatient(patientId);
		return ResponseEntity.status(HttpStatus.OK).build();

	}

	@PostMapping("/{patientId}/selectdoc/{doctorId}")
	public ResponseEntity<Void> addDoctor(@PathVariable String patientId, @PathVariable String doctorId) {
		patientService.bookAppointment(patientId, doctorId);
		return ResponseEntity.status(HttpStatus.OK).build();

	}

	@CrossOrigin(origins="http://localhost:3000")
	@GetMapping("/doc/{patientId}")
	public ResponseEntity<DCA_Patient> getPatientForDoctor(@PathVariable String patientId) {
		return ResponseEntity.status(HttpStatus.OK).body(patientService.getPatientForDoctor(patientId));
	}
	
	
//	@GetMapping("/doctor/{doctor_id}")
//	public ResponseEntity<List<DCA_Patient>> getPatientByDoctorId(@PathVariable String doctor_id){
//		List<DCA_Patient> patientList=patientService.getPatientByDoctorId(doctor_id);
//		if(patientList.isEmpty())
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//		else
//			return ResponseEntity.status(HttpStatus.FOUND).body(patientList);
//	}
//	
//	@GetMapping("/receptionist/{receptionistId}")
//	public ResponseEntity<List<DCA_Patient>> getPatientByReceptionistId(@PathVariable String receptionistId){
//		List<DCA_Patient> patientList=patientService.getPatientByReceptionistId(receptionistId);
//		if(patientList.isEmpty())
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//		else
//			return ResponseEntity.status(HttpStatus.FOUND).body(patientList);
//	}
//	
//	@GetMapping("/user/{userId}")
//	public ResponseEntity<List<DCA_Patient>> getPatientByUserId(@PathVariable String userId){
//		List<DCA_Patient> patientList=patientService.getPatientByUserId(userId);
//		if(patientList.isEmpty())
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//		else
//			return ResponseEntity.status(HttpStatus.FOUND).body(patientList);
//	}
//	
//	@GetMapping("/appointment/{appointmentId}")
//	public ResponseEntity<List<DCA_Patient>> getPatientByAppointmentId(@PathVariable String appointmentId){
//		List<DCA_Patient> patientList=patientService.getPatientByAppointmentId(appointmentId);
//		if(patientList.isEmpty())
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//		else
//			return ResponseEntity.status(HttpStatus.FOUND).body(patientList);
//	}
}
