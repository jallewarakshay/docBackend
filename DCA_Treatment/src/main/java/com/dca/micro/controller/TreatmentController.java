package com.dca.micro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dca.micro.entity.DCA_Treatment;
import com.dca.micro.service.Treatment_service;


@RestController
@RequestMapping("/treatment")
public class TreatmentController {
	@Autowired
	Treatment_service treatmentService;
	
	@PostMapping
	public ResponseEntity<DCA_Treatment> createMessages(@RequestBody DCA_Treatment treatment) {
		return ResponseEntity.status(HttpStatus.CREATED).body(treatmentService.createTreatment(treatment));
	}
	
	@GetMapping
	public ResponseEntity<List<DCA_Treatment>> getAllTreatments() {
		return ResponseEntity.status(HttpStatus.FOUND).body(treatmentService.getAllTreatments());
	}
	
	@GetMapping("/{treatmentId}")
	public ResponseEntity<DCA_Treatment> getTreatment(@PathVariable String treatmentId) {
		return ResponseEntity.status(HttpStatus.FOUND).body(treatmentService.getTreatment(treatmentId));
	}
	
	@PutMapping("/{treatmentId}")
	public ResponseEntity<Void> updateTreatment(@PathVariable String treatmentId, @RequestBody DCA_Treatment treatment) {
		treatmentService.updateTreatment(treatment, treatmentId);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@DeleteMapping("/{treatmentId}")
	public ResponseEntity<Void> deleteTreatment(@PathVariable String treatmentId){
		treatmentService.deleteTreatment(treatmentId);
		return ResponseEntity.status(HttpStatus.OK).build();
		
	}
	
	@GetMapping("/patient/{patientId}")
	public ResponseEntity<List<DCA_Treatment>> getPatient(@PathVariable String patientId) {
		return ResponseEntity.status(HttpStatus.FOUND).body(treatmentService.getByPatientId(patientId));
	}
	
	@GetMapping("/doctor/{doctorId}")
	public ResponseEntity<List<DCA_Treatment>> getDoctor(@PathVariable String doctorId) {
		return ResponseEntity.status(HttpStatus.FOUND).body(treatmentService.getByDoctorId(doctorId));
	}
}
