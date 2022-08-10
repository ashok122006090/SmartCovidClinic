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

import com.smartcovidclinic.entities.Doctor;
import com.smartcovidclinic.service.DoctorService;

@RestController
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	@GetMapping("/doctors")
	public List<Doctor> getDoctors(){
		return this.doctorService.getDoctors();
	}
	@PostMapping("/doctors")
	public Doctor addDoctors(@RequestBody Doctor doctor) {
		return this.doctorService.addDoctors(doctor);
	}
	
	@PutMapping("/doctors")
	public Doctor updateDoctors(@RequestBody Doctor doctor) {
		return this.doctorService.updateDoctors(doctor);
	}
	@DeleteMapping("/doctors/{doctor_Id}")
	public void deletePatientById(@PathVariable int doctor_Id) {
		this.doctorService.deleteDoctorById(doctor_Id);
		
	}
	

}
