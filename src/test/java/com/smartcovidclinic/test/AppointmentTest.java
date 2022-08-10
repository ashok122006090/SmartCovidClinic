package com.smartcovidclinic.test;

import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.smartcovidclinic.dao.AppointmentDAO;
import com.smartcovidclinic.dao.DoctorDAO;
import com.smartcovidclinic.entities.Appointment;
import com.smartcovidclinic.entities.Doctor;
import com.smartcovidclinic.entities.Patient;
import com.smartcovidclinic.service.AppointmentService;
import com.smartcovidclinic.service.DoctorService;

public class AppointmentTest {
	@MockBean
	private AppointmentDAO appointmentDAO;
	@Autowired
	private AppointmentService appointmentService;
	
	public void getAllAppointmentsTest() {
		((Stream<Appointment>) when(appointmentDAO.findAll()).thenReturn((List<Appointment>) Stream.of( new Appointment(21,new Patient(21,"madhu",912161,23),"ashok","cough",LocalDate.parse("2022-03-09"))))).collect
(Collectors.toList());
	}
}