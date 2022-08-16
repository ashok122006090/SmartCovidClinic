package com.smartcovidclinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smartcovidclinic.entities.Doctor;
import com.smartcovidclinic.entities.Patient;
import com.smartcovidclinic.service.PatientService;


@CrossOrigin(origins="http://localhost:3000")
@RestController
public class PatientController {
	
	@Autowired
	private PatientService patientService;

	
	 @GetMapping("/patient")
		public ResponseEntity<Doctor> getDoctors(){
			List<Patient>PatientImpl = patientService.getPatients();
			return new ResponseEntity(PatientImpl, HttpStatus.OK);
		}
		@PostMapping("/patient")
		public ResponseEntity<Patient> addPatient(@RequestBody Patient patientDAO) {
			Patient patientImpl = patientService.addPatient(patientDAO);
			return new ResponseEntity(patientImpl, HttpStatus.CREATED);
		}
		@PutMapping("/patient")
		public ResponseEntity<Patient> updatePatient(@RequestBody Patient patient) {
			Patient patientImpl = patientService.updatePatient(patient);
			return new ResponseEntity(patientImpl,HttpStatus.ACCEPTED);}
		
	@DeleteMapping("/patient/{patient_Id}") 
	public void deletePatientById(@PathVariable int patient_Id) {
		this.patientService.deletePatientById(patient_Id);
		
	}

}