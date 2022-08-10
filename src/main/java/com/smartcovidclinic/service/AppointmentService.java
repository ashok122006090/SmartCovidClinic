package com.smartcovidclinic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smartcovidclinic.entities.Appointment;



@Service
public interface AppointmentService {

	public int addAppointment(Appointment appointment);

	public List<Appointment> viewAppointments();
	
	public void deleteappointment(int appointmentId);

	 

}
