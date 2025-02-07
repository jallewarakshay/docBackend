package com.dca.micro.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dca.micro.entity.DCA_Treatment;

public interface TreatmentRepository extends MongoRepository<DCA_Treatment, String> {
	List<DCA_Treatment> findByPatientId(String patientId);
	List<DCA_Treatment> findByDoctorId(String doctorId);
}
