package com.dca.micro.Service;

import java.util.List;
import java.util.Map;

import com.dca.micro.entity.DCA_Patient;

public interface PatientService {
	DCA_Patient create(Map<String, Object> payload);
	List<DCA_Patient> getAllPatient();
	void updatePatient(DCA_Patient patient,String id);
	DCA_Patient getPatient(String id);
	void deletePatient(String id);
	void bookAppointment(String patientId, String doctorId);
//	List<DCA_Patient> getPatientByDoctorId(String DocId);
//	List<DCA_Patient> getPatientByReceptionistId(String receptionistId);
//	List<DCA_Patient> getPatientByUserId(String userId);
//	List<DCA_Patient> getPatientByAppointmentId(String appointmentId);
}
