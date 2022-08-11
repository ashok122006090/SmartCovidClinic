package com.smartcovidclinic.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "appointment")
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int appointmentId;
	
	@ManyToOne(optional = false)
  @JoinColumn(name="Patient_Id")
	
	 Patient patient; 
	@ManyToOne(optional = false)
	  @JoinColumn(name="Doctorid")
		
		 Doctor doctor;
	

	@NotBlank(message = "Symptoms are  mandatory")
 String symptoms;
 LocalDate appointmentDate;
 Appointment(){
	 
 }
@Override
public String toString() {
	return "Appointment [appointmentId=" + appointmentId + ", patient=" + patient + ", doctor=" + doctor + ", symptoms="
			+ symptoms + ", appointmentDate=" + appointmentDate + "]";
}
public Appointment(int appointmentId, Patient patient, Doctor doctor,
		@NotBlank(message = "Symptoms are  mandatory") String symptoms, LocalDate appointmentDate) {
	super();
	this.appointmentId = appointmentId;
	this.patient = patient;
	this.doctor = doctor;
	this.symptoms = symptoms;
	this.appointmentDate = appointmentDate;
}
public int getAppointmentId() {
	return appointmentId;
}
public void setAppointmentId(int appointmentId) {
	this.appointmentId = appointmentId;
}
public Patient getPatient() {
	return patient;
}
public void setPatient(Patient patient) {
	this.patient = patient;
}
public Doctor getDoctor() {
	return doctor;
}
public void setDoctor(Doctor doctor) {
	this.doctor = doctor;
}
public String getSymptoms() {
	return symptoms;
}
public void setSymptoms(String symptoms) {
	this.symptoms = symptoms;
}
public LocalDate getAppointmentDate() {
	return appointmentDate;
}
public void setAppointmentDate(LocalDate appointmentDate) {
	this.appointmentDate = appointmentDate;
}

	
	
}