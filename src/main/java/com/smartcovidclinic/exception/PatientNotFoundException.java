package com.smartcovidclinic.exception;

public class PatientNotFoundException extends RuntimeException{
	private String message;
	private static final long serialVersionUID = 1L;

	public PatientNotFoundException(String message) {
		super();
		this.message=message;
		
	}
	public PatientNotFoundException() {

}
}