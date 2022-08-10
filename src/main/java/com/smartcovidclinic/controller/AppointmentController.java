package com.smartcovidclinic.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartcovidclinic.entities.Appointment;
import com.smartcovidclinic.service.AppointmentService;



@RestController
public class AppointmentController {
	@Autowired
	private AppointmentService appointmentService;
	

	@PostMapping("/addAppointment")
    public ResponseEntity<Appointment> addAppointment(@RequestBody Appointment appointmentDAO) {
        int appointmentimpl = appointmentService.addAppointment(appointmentDAO);
        return new ResponseEntity(appointmentimpl, HttpStatus.CREATED);
    }
	@GetMapping("/appointment")
    public ResponseEntity<Appointment> viewappointments() {
        List<Appointment> AppointmentImpl = appointmentService.viewAppointments();
        return new ResponseEntity(AppointmentImpl, HttpStatus.OK);
    }

}
