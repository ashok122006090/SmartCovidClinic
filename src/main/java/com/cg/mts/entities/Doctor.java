package com.cg.mts.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Doctor")
public class Doctor {
   int Doctorid;
   @Id
	@GeneratedValue
	String DoctorName;
	int Date;
	
	public Doctor(int doctorid, String doctorName, int date) {
		super();
		Doctorid = doctorid;
		DoctorName = doctorName;
		Date = date;
	}
	@Override
	public String toString() {
		return "Doctor [Doctorid=" + Doctorid + ", DoctorName=" + DoctorName + ", Date=" + Date + "]";
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
	public int getDate() {
		return Date;
	}
	public void setDate(int date) {
		Date = date;
	}
	
}
