package com.smartcovidclinic.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcovidclinic.dao.AppointmentDAO;
import com.smartcovidclinic.entities.Appointment;
import com.smartcovidclinic.entities.Doctor;
import com.smartcovidclinic.exception.AppointmentNotFoundException;
import com.smartcovidclinic.exception.DoctorNotFoundException;


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

//	@Override
//	public void deleteAppointmentById(int appointmentId) {
//		// TODO Auto-generated method stub
//		Appointment obj = appointmentDAO.getOne(appointmentId);
//		appointmentDAO.delete(obj);
//		
//	}

	@Override
	public Appointment updateAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		appointmentDAO.save(appointment);
		return appointment;
	}
	@Override
	public String deleteAppointmentById(int appointmentId) throws AppointmentNotFoundException {
		
		Optional<Appointment> appointment =appointmentDAO.findById(appointmentId);

		String message = null;
		
		if (appointment.isPresent()) {
			appointmentDAO.deleteById(appointmentId);
			
			message = new String("Appointment Record deleted successfully.");
		}else {
			throw new AppointmentNotFoundException("No such Appointment");
		}
		
		return message;
		
	}


}
