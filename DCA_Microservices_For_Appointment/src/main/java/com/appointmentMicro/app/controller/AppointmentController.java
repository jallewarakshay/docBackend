package com.appointmentMicro.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appointmentMicro.app.entity.DCA_Appointment;
import com.appointmentMicro.app.service.AppointmentService;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

	@Autowired
	AppointmentService appointmentService;
	
	@GetMapping
	public List<DCA_Appointment> getAllAppointments() {
		return appointmentService.getAllAppointments();
	}

	@PostMapping
	public void createAppointment(@RequestBody DCA_Appointment appt) {
		appointmentService.createAppointment(appt);
	}

	@GetMapping("/patient/{patientId}")
	public List<DCA_Appointment> getPatientId(@PathVariable String patientId) {
		return appointmentService.getAppointmentByPatientId(patientId);
	}

	@GetMapping("/doctor/{doctorId}")
	public List<String> getDoctorId(@PathVariable String doctorId) {
		List<String> lstDoctor = (List<String>) appointmentService.getAppointmentByPatientId(doctorId).stream()
				.map(appt -> appt.getPatientId());

		return lstDoctor;
	}
}
