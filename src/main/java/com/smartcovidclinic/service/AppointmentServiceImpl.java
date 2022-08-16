package com.smartcovidclinic.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcovidclinic.dao.AppointmentDAO;
import com.smartcovidclinic.entities.Appointment;


@Service
public class AppointmentServiceImpl implements AppointmentService{
	
	@Autowired
	private AppointmentDAO appointmentDAO;

	@Override
	public Appointment addAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		appointmentDAO.save(appointment);
		return appointment;
	}

	@Override
	public List<Appointment> viewAppointments() {
		// TODO Auto-generated method stub
		return appointmentDAO.findAll();
	}

	@Override
	public void deleteAppointmentById(int appointmentId) {
		// TODO Auto-generated method stub
		Appointment obj = appointmentDAO.getOne(appointmentId);
		appointmentDAO.delete(obj);
		
	}

	@Override
	public Appointment updateAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		appointmentDAO.save(appointment);
		return appointment;
	}



}
