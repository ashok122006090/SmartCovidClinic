package com.smartcovidclinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcovidclinic.dao.DoctorDAO;
import com.smartcovidclinic.entities.Doctor;

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

}
