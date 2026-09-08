package com.flm.patient.exceptions;

public class PatientNotFoundException extends RuntimeException{

	public PatientNotFoundException(String message) {
		super(message);
	}
}
