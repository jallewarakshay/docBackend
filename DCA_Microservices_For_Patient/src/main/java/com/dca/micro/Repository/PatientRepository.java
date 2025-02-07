package com.dca.micro.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dca.micro.entity.DCA_Patient;

public interface PatientRepository  extends JpaRepository<DCA_Patient,String> {
	
//	List<DCA_Patient> findAllByDoctorId(String docId);
//	List<DCA_Patient> findAllByReceptionistId(String receptionistId);
//	List<DCA_Patient> findAllByUserId(String userId);
//	List<DCA_Patient> findAllByAppointmentId(String appointmentId);
	
}


