package com.smartcovidclinic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcovidclinic.dao.DoctorDAO;
import com.smartcovidclinic.entities.Doctor;
import com.smartcovidclinic.entities.Patient;
import com.smartcovidclinic.exception.DoctorNotFoundException;


@Service
public class DoctorServiceImpl implements DoctorService{
	

	@Autowired
	private DoctorDAO doctorDAO;

	@Override
	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctorDAO.findAll();
	}

	@Override
	public Doctor addDoctors(Doctor doctor) {
		// TODO Auto-generated method stub
		doctorDAO.save(doctor);
		return doctor;
	
	}

	@Override
	public Doctor updateDoctors(Doctor doctor) {
		// TODO Auto-generated method stub
		doctorDAO.save(doctor);
		return doctor;
	}
	@Override
	public String deleteDoctorById(int doctorId) throws DoctorNotFoundException {
		
		Optional<Doctor> doctor =doctorDAO.findById(doctorId);

		String message = null;
		
		if (doctor.isPresent()) {
			doctorDAO.deleteById(doctorId);
			
			message = new String("Doctor Record deleted successfully.");
		}else {
			throw new DoctorNotFoundException("No such Doctor");
		}
		
		return message;
		
	}

	@Override
	public Doctor getDoctorById(int doctor_id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
