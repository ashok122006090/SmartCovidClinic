package com.smartcovidclinic.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartcovidclinic.entities.Appointment;

public interface AppointmentDAO extends JpaRepository<Appointment, Integer >{


}
