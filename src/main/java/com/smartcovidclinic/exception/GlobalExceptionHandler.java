package com.smartcovidclinic.exception;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@Value(value = "${data.exception.message1}")
	private String message1;
	
	
	@ExceptionHandler(value = PatientNotFoundException.class)
     public ResponseEntity PatientNotFoundException(PatientNotFoundException ex) {

	return new ResponseEntity(message1, HttpStatus.NOT_FOUND);

	}
	@Value(value = "${data.exception.message2}")
	private String message2;
	
	
	@ExceptionHandler(value = DoctorNotFoundException.class)
     public ResponseEntity DoctorNotFoundException(DoctorNotFoundException ex) {

	return new ResponseEntity(message2, HttpStatus.NOT_FOUND);


	}
	@Value(value = "${data.exception.message3}")
	private String message3;
	
	
	@ExceptionHandler(value = AppointmentNotFoundException.class)
     public ResponseEntity AppointmentNotFoundException(AppointmentNotFoundException ex) {

	return new ResponseEntity(message3, HttpStatus.NOT_FOUND);


	}
}