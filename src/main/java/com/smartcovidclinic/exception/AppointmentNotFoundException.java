package com.smartcovidclinic.exception;


public class AppointmentNotFoundException extends RuntimeException{
	private String message;
	private static final long serialVersionUID = 1L;

	public AppointmentNotFoundException(String message) {
		super();
		this.message=message;
		
	}
	public AppointmentNotFoundException() {

}
}