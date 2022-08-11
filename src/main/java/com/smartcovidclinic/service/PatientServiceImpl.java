package com.smartcovidclinic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcovidclinic.dao.PatientDAO;
import com.smartcovidclinic.entities.Patient;
import com.smartcovidclinic.exception.PatientNotFoundException;


@Service
public class PatientServiceImpl implements PatientService{
	
	@Autowired
	private PatientDAO patientDAO;

	@Override
	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
	 return patientDAO.findAll();
	}

	@Override
	public Patient addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patientDAO.save(patient);
		return patient;
	}

	@Override
	public Patient updatePatient(Patient patient) {
		// TODO Auto-generated method stub
		patientDAO.save(patient);
		return patient;
	}

//	@Override
//	public void deletePatientById(int patientId) {
//		// TODO Auto-generated method stub
//	Patient obj = patientDAO.getOne(patientId);
//	 patientDAO.delete (obj);
//	 
//	
//	}
	@Override
	public String deletePatientById(int patientId) throws PatientNotFoundException {
		
		Optional<Patient> patient =patientDAO.findById(patientId);

		String message = null;
		
		if (patient.isPresent()) {
			patientDAO.deleteById(patientId);
			
			message = new String("Patient Record deleted successfully.");
		}else {
			throw new PatientNotFoundException("No such Patient");
		}
		
		return message;
		
	}

	
}
