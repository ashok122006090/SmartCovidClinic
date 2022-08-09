package com.smartcovidclinic.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartcovidclinic.entities.Patient;



public interface PatientDAO extends JpaRepository<Patient, Integer >{
	

}
