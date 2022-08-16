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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smartcovidclinic.entities.Doctor;
import com.smartcovidclinic.service.DoctorService;
@CrossOrigin(origins="http://localhost:3000")
@RestController
public class DoctorController {
	
   @Autowired
	private DoctorService doctorService;
	

   @GetMapping("/doctors/{doctor_id}")
	public Doctor getDoctorById(@PathVariable int doctor_id) {
		return this.doctorService.getDoctorById(doctor_id);
	}
    
   @GetMapping("/doctors")
	public ResponseEntity<Doctor> getDoctors(){
		List<Doctor> DoctorImpl = doctorService.getDoctors();
		return new ResponseEntity(DoctorImpl, HttpStatus.OK);
	}
	@PostMapping("/doctors")
	public ResponseEntity<Doctor> addDoctors(@RequestBody Doctor doctorDAO) {
		Doctor doctorImpl = doctorService.addDoctors(doctorDAO);
		return new ResponseEntity(doctorImpl, HttpStatus.CREATED);
	}
	@PutMapping("/doctors")
	public ResponseEntity<Doctor> updateDoctors(@RequestBody Doctor doctor) {
		Doctor doctorImpl = doctorService.updateDoctors(doctor);
		return new ResponseEntity(doctorImpl,HttpStatus.ACCEPTED);}
	
	@DeleteMapping("/doctors/{doctor_Id}")
	public void deletePatientById(@PathVariable int doctor_Id) {
		this.doctorService.deleteDoctorById(doctor_Id);
		
	}
	

}
