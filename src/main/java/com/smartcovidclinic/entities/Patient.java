package com.smartcovidclinic.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


@Entity
@Table(name = "patient")
public class Patient {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "Patient_Id")
	private int patientId;
	//@NotBlank(message = "Name is mandatory")
	 String patientName;
	 int patientAge;
	//@Pattern(regexp="[6-9]{1}[0-9]{9}",message="mobile number must have 10 characters")
   long patientContactNo;
	
	Patient(){
		
	}
	

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientAge=" + patientAge
				+ ", patientContactNo=" + patientContactNo + "]";
	}


	public Patient(int patientId, String patientName, int patientAge, long patientContactNo) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientContactNo = patientContactNo;
	}


	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public long getPatientContactNo() {
		return patientContactNo;
	}

	public void setPatientContactNo(long patientContactNo) {
		this.patientContactNo = patientContactNo;
	}
	
	

}
