package com.appointmentMicro.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	
	@CrossOrigin(origins="http://localhost:3000")
	@GetMapping
	public List<DCA_Appointment> getAllAppointments() {
		return appointmentService.getAllAppointments();
	}
	
	@CrossOrigin(origins="http://localhost:3000")
	@PostMapping
	public void createAppointment(@RequestBody DCA_Appointment appt) {
		appointmentService.createAppointment(appt);
	}

	@GetMapping("/patient/{patientId}")
	public List<String> getPatientId(@PathVariable String patientId) {
		return appointmentService.getAppointmentByPatientId(patientId).stream().map(appt -> appt.getDoctorId()).toList();
	}

	@GetMapping("/doctor/{doctorId}")
	public List<String> getDoctorId(@PathVariable String doctorId) {
		List<String> lstDoctor = appointmentService.getAppointmentByDoctorId(doctorId).stream()
				.map(appt -> appt.getPatientId()).toList();

		return lstDoctor;
	}
}
