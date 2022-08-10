package com.smartcovidclinic.service;

import java.util.ArrayList;
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
	public int addAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Appointment> viewAppointments() {
		// TODO Auto-generated method stub
		return appointmentDAO.findAll();
	}

	@Override
	public void deleteappointment(int appointmentId) {
		// TODO Auto-generated method stub
		
	}


}
