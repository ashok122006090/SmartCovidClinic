package com.smartcovidclinic.test;

import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.smartcovidclinic.dao.DoctorDAO;
import com.smartcovidclinic.entities.Doctor;
import com.smartcovidclinic.service.DoctorService;

public class DoctorTest {
	@MockBean
	private DoctorDAO doctorDAO;
	@Autowired
	private DoctorService doctorService;
	
	public void getAllDoctorsTest() {
		((Stream<Doctor>) when(doctorDAO.findAll()).thenReturn((List<Doctor>) Stream.of( new Doctor(2,"ashok","rfrv",LocalDate.parse("2022-03-09"))))).collect
(Collectors.toList());
	}
}