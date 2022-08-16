package com.smartcovidclinic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smartcovidclinic.entities.Patient;

@Service
public interface PatientService {
	
	public List<Patient> getPatients();
	public Patient addPatient(Patient patient);
    public Patient updatePatient(Patient patient);
    public String deletePatientById(int patientId);

}