package com.dca.micro.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dca.micro.entity.DCA_ExpDoc;
import com.dca.micro.repository.ExpDocRespository;

@Service
public class ExpDocServices {

	@Autowired
	ExpDocRespository expDocRespository;
	
	public DCA_ExpDoc createExperience(DCA_ExpDoc expDoc) {
		expDoc.setExperienceId(UUID.randomUUID().toString());
		return expDocRespository.save(expDoc);
	}
	
	public List<DCA_ExpDoc> getAllExperience() {
		return expDocRespository.findAll();
	}
	
	public DCA_ExpDoc getSingleExperience(String experience_id) {
		return expDocRespository.findById(experience_id).get();
	}
	
	public void updateExperience(String experience_id, DCA_ExpDoc expDoc) {
		expDoc.setExperienceId(experience_id);
		expDocRespository.save(expDoc);
	}
	
	public void deleteExperience(String experience_id) {
		expDocRespository.deleteById(experience_id);
	}
	
	public List<DCA_ExpDoc> getDoctor(String doctorId) {
		return expDocRespository.findByDoctorId(doctorId);
	}
}
