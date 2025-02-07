package com.dca.micro.serviceimpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dca.micro.entity.DCA_Treatment;
import com.dca.micro.repository.TreatmentRepository;
import com.dca.micro.service.Treatment_service;

@Service
public class TreatmentServiceImpl implements Treatment_service{
	
	@Autowired
	TreatmentRepository treatmentRepo;

	@Override
	public List<DCA_Treatment> getAllTreatments() {
		return treatmentRepo.findAll();
	}

	@Override
	public DCA_Treatment getTreatment(String id) {
		return treatmentRepo.findById(id).get();
	}

	@Override
	public DCA_Treatment createTreatment(DCA_Treatment treatment) {
		treatment.setTreatmentId(UUID.randomUUID().toString());
		return treatmentRepo.save(treatment);
	}

	@Override
	public void updateTreatment(DCA_Treatment treatment, String id) {
		
		DCA_Treatment treatment1=treatmentRepo.findById(id).get();
		treatment1.setPatientId(treatment.getPatientId());
		treatment1.setDoctorId(treatment.getDoctorId());
		treatment1.setDescription(treatment.getDescription());
		treatment1.setPrescription(treatment.getPrescription());
		treatmentRepo.save(treatment1);
	}

	@Override
	public void deleteTreatment(String id) {
		treatmentRepo.deleteById(id);
	}

	@Override
	public List<DCA_Treatment> getByPatientId(String patientId) {
		return treatmentRepo.findByPatientId(patientId);
	}

	@Override
	public List<DCA_Treatment> getByDoctorId(String doctorId) {
		return treatmentRepo.findByDoctorId(doctorId);
	}

}
