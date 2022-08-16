package com.smartcovidclinic.entities;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
@Entity
@Table(name="Doctor")
public class Doctor {
   
   @Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
  // @Column(name="doctor_id")
	private int Doctorid;
   @NotBlank(message = "Name is mandatory")
  
    String DoctorName;
   @NotBlank(message = "Name is mandatory")
   String Specialization;
	LocalDate Date;
	Doctor(){
		
	}
	
	public Doctor(int doctorid, @NotBlank(message = "Name is mandatory") String doctorName,
			@NotBlank(message = "Name is mandatory") String specialization, LocalDate date) {
		super();
		Doctorid = doctorid;
		DoctorName = doctorName;
		Specialization = specialization;
		Date = date;
	}

	@Override
	public String toString() {
		return "Doctor [Doctorid=" + Doctorid + ", DoctorName=" + DoctorName + ", Specialization=" + Specialization
				+ ", Date=" + Date + "]";
	}

	public int getDoctorid() {
		return Doctorid;
	}
	public void setDoctorid(int doctorid) {
		Doctorid = doctorid;
	}
	public String getDoctorName() {
		return DoctorName;
	}
	public void setDoctorName(String doctorName) {
		DoctorName = doctorName;
	}
	public String getSpecialization() {
		return Specialization;
	}
	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}
	public LocalDate getDate() {
		return Date;
	}
	public void setDate(LocalDate date) {
		Date = date;
	}
	
}
