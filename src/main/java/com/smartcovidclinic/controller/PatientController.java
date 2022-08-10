package com.smartcovidclinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smartcovidclinic.entities.Patient;
import com.smartcovidclinic.service.PatientService;



@RestController
public class PatientController {
	
	@Autowired
	private PatientService patientService;

	
	@GetMapping("/patient")
	public List<Patient> getPatients(){
		return this.patientService.getPatients();
	}
	@PostMapping("/patient")
	public Patient addPatient(@RequestBody Patient patient) {
		return this.patientService.addPatient(patient);
	}
	@PutMapping("/patient")
	public Patient updatePatient(@RequestBody Patient patient) {
		return this.patientService.updatePatient(patient);
	}
	@DeleteMapping("/patient/{patient_Id}")
	public void deletePatientById(@PathVariable int patient_Id) {
		this.patientService.deletePatientById(patient_Id);
		
	}

}

