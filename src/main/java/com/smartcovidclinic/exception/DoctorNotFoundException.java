package com.smartcovidclinic.exception;



public class DoctorNotFoundException extends RuntimeException{
	private String message;
	private static final long serialVersionUID = 1L;

	public DoctorNotFoundException(String message) {
		super();
		this.message=message;
		
	}
	public DoctorNotFoundException() {

}
}