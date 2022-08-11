package com.smartcovidclinic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smartcovidclinic.entities.Appointment;
import com.smartcovidclinic.entities.Patient;



@Service
public interface AppointmentService {

	public Appointment addAppointment(Appointment appointment);

	public List<Appointment> viewAppointments();
	
	public String deleteAppointmentById(int appointmentId);
	 public Appointment updateAppointment(Appointment appointment);
	    

	 

}
