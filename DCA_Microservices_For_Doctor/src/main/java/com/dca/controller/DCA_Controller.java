package com.dca.controller;

import java.io.IOException;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.dca.entity.DCA_Doctor;
import com.dca.service.DCA_service;

@RestController
@RequestMapping("/doctor")
public class DCA_Controller {
	@Autowired
	DCA_service dca_service;
	
	@CrossOrigin(origins="http://localhost:3000")
	@GetMapping
	public ResponseEntity<List<DCA_Doctor>> getAllDoctor() {
		List<DCA_Doctor> dca_doctor = dca_service.getAllDoctor();
		if (dca_doctor.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
			return ResponseEntity.status(HttpStatus.OK).body(dca_doctor);

	}

	@CrossOrigin(origins="http://localhost:3000")
	@PostMapping("/")
	public ResponseEntity<DCA_Doctor> create(@RequestBody Map<String, Object> doctor) {
		return ResponseEntity.status(HttpStatus.CREATED).body(dca_service.create_Doctor(doctor));
	}
	
	@CrossOrigin(origins="http://localhost:3000")
	@GetMapping("/{doctorId}")
	public ResponseEntity<DCA_Doctor> getDoctor(@PathVariable String doctorId) {
		
		return ResponseEntity.status(HttpStatus.OK).body(dca_service.get_Doctor(doctorId));
	}

	@PutMapping("/{doctorId}")
	public ResponseEntity<Void> updateDoctor(@RequestBody DCA_Doctor dca_Doctor, @PathVariable String doctorId) {
		dca_service.update_Doctor(dca_Doctor, doctorId);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

	@DeleteMapping("/{doctorId}")
	public ResponseEntity<Void> deleteDoctor(@PathVariable String doctorId) {
		dca_service.delete_Doctor(doctorId);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@PostMapping("/uploadLicence")
	public ResponseEntity<Void> uploadLicence(@RequestParam String doctorId,@RequestParam MultipartFile file) throws IOException {
		dca_service.uploadLicence(doctorId, file);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
