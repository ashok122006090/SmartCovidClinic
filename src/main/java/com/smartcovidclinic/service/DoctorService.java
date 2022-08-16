package com.smartcovidclinic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smartcovidclinic.entities.Doctor;

@Service
public interface DoctorService {
	public List<Doctor> getDoctors();
	public Doctor addDoctors(Doctor doctor) ;
    public Doctor updateDoctors(Doctor doctor);
	public String deleteDoctorById(int doctor_Id);
	public Doctor getDoctorById(int doctor_id);
 

}
