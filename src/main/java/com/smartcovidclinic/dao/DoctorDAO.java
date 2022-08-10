package com.smartcovidclinic.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartcovidclinic.entities.Doctor;

public interface DoctorDAO extends JpaRepository<Doctor, Integer >{

}
