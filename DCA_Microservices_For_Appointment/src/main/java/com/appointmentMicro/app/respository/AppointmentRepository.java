package com.appointmentMicro.app.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appointmentMicro.app.entity.DCA_Appointment;

public interface AppointmentRepository extends JpaRepository<DCA_Appointment, String>{
	List<DCA_Appointment> findByPatientId(String patientId);
	List<DCA_Appointment> findByDoctorId(String docId);
}
