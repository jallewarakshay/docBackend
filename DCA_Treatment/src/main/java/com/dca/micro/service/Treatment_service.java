package com.dca.micro.service;

import java.util.List;

import com.dca.micro.entity.DCA_Treatment;

public interface Treatment_service {
 
	List<DCA_Treatment> getAllTreatments();
	DCA_Treatment getTreatment(String id);
	DCA_Treatment createTreatment(DCA_Treatment treatment);
	void updateTreatment(DCA_Treatment treatment,String id);
	void deleteTreatment(String id);
	List<DCA_Treatment> getByPatientId(String patientId);
	List<DCA_Treatment> getByDoctorId(String doctorId);
	
}
