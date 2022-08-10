package com.smartcovidclinic.test;

import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.smartcovidclinic.dao.DoctorDAO;
import com.smartcovidclinic.dao.PatientDAO;
import com.smartcovidclinic.entities.Doctor;
import com.smartcovidclinic.entities.Patient;
import com.smartcovidclinic.service.DoctorService;
import com.smartcovidclinic.service.PatientService;

public class PatientTest {
	@MockBean
	private PatientDAO patientDAO;
	@Autowired
	private PatientService patientService;
	
	public void getAllPatientTest() {
		((Stream<Patient>) when(patientDAO.findAll()).thenReturn((List<Patient>) Stream.of( new Patient(21,"madhu",912161,23)))).collect
(Collectors.toList());
	}
}