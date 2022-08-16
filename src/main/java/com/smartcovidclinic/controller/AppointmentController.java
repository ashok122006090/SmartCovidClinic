package com.smartcovidclinic.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartcovidclinic.entities.Appointment;
import com.smartcovidclinic.entities.Doctor;
import com.smartcovidclinic.service.AppointmentService;


@CrossOrigin(origins="http://localhost:3000")
@RestController
public class AppointmentController {
	@Autowired
	private AppointmentService appointmentService;
	@GetMapping("/appointment")
    public ResponseEntity<Appointment> viewappointments() {
        List<Appointment> AppointmentImpl = appointmentService.viewAppointments();
        return new ResponseEntity(AppointmentImpl, HttpStatus.OK);
    }
	@PostMapping("/appointment")
	public Appointment addAppointment(@RequestBody Appointment appointment) {
		return this.appointmentService.addAppointment(appointment);
	}
	
	@PutMapping("/appointment")
	public Appointment updateAppointment(@RequestBody Appointment appointment) {
		return this.appointmentService.updateAppointment(appointment);
	}
	@DeleteMapping("/appointment/{appointment_Id}")
	public void deleteAppointmentById(@PathVariable int appointment_Id) {
		this.appointmentService.deleteAppointmentById(appointment_Id);
		
	}
}
