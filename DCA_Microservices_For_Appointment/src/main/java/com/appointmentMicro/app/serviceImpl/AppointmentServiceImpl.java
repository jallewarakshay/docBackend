package com.appointmentMicro.app.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appointmentMicro.app.entity.DCA_Appointment;
import com.appointmentMicro.app.respository.AppointmentRepository;
import com.appointmentMicro.app.service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService{
	
	@Autowired
	AppointmentRepository appointmentRepository;
	

	@Override
	public void createAppointment(DCA_Appointment appointment) {
		appointment.setAppointmentId(UUID.randomUUID().toString());
		appointmentRepository.save(appointment);
		
	}

	@Override
	public DCA_Appointment getAppointment(String id) {
		return appointmentRepository.findById(id).get();
	}

	@Override
	public List<DCA_Appointment> getAppointmentByPatientId(String id) {
		return appointmentRepository.findByPatientId(id);
	}

	@Override
	public List<DCA_Appointment> getAppointmentByDoctorId(String id) {
		return appointmentRepository.findByDoctorId(id);
	}

	@Override
	public List<DCA_Appointment> getAllAppointments() {
		return appointmentRepository.findAll();
	}

	

}
