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

import com.dca.micro.entity.DCA_ExpDoc;
import com.dca.micro.services.ExpDocServices;

@RestController
@RequestMapping("/experience")
public class ExpDocController {
	@Autowired
	ExpDocServices expDocServices;
	
	@PostMapping
	public ResponseEntity<DCA_ExpDoc> createExp(@RequestBody DCA_ExpDoc expDoc) {
		return ResponseEntity.status(HttpStatus.CREATED).body(expDocServices.createExperience(expDoc));
	}
	
	@GetMapping
	public ResponseEntity<List<DCA_ExpDoc>> getAllExp() {
		return ResponseEntity.status(HttpStatus.FOUND).body(expDocServices.getAllExperience());
	}
	
	@GetMapping("/{experienceId}")
	public ResponseEntity<DCA_ExpDoc> getSingleExp(@PathVariable String experienceId) {
		return ResponseEntity.status(HttpStatus.FOUND).body(expDocServices.getSingleExperience(experienceId));
	}
	
	@PutMapping("/{experienceId}")
	public ResponseEntity<Void> updateExp(@PathVariable String experienceId, @RequestBody DCA_ExpDoc expDoc) {
		expDocServices.updateExperience(experienceId, expDoc);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@DeleteMapping("/{experienceId}")
	public ResponseEntity<Void> deleteExp(@PathVariable String experienceId) {
		expDocServices.deleteExperience(experienceId);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@GetMapping("/doctor/{doctorId}")
	public ResponseEntity<List<DCA_ExpDoc>> getDoc(@PathVariable String doctorId) {
		return ResponseEntity.status(HttpStatus.FOUND).body(expDocServices.getDoctor(doctorId));
	}
}
