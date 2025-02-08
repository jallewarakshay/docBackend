package com.appointmentMicro.app.service;

import java.util.List;

import com.appointmentMicro.app.entity.DCA_Appointment;

public interface AppointmentService {
	void createAppointment(DCA_Appointment appointment);
	List<DCA_Appointment> getAllAppointments();
	DCA_Appointment getAppointment(String id);
	List<DCA_Appointment> getAppointmentByPatientId(String id);
	List<DCA_Appointment> getAppointmentByDoctorId(String id);
}
