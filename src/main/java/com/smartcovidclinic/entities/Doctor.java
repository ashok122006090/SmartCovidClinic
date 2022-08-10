package com.smartcovidclinic.entities;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Doctor")
public class Doctor {
   
   @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Doctorid;
    String DoctorName;
	LocalDate Date;
	public Doctor() {
		}
	
	public Doctor(int doctorid, String doctorName, LocalDate date) {
		super();
		Doctorid = doctorid;
		DoctorName = doctorName;
		Date = date;
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
	public LocalDate getDate() {
		return Date;
	}
	public void setDate(LocalDate date) {
		Date = date;
	}

	@Override
	public String toString() {
		return "Doctor [Doctorid=" + Doctorid + ", DoctorName=" + DoctorName + ", Date=" + Date + "]";
	}
	

}
