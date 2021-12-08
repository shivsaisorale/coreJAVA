package com.xworkz.starter.exception;

public class PanValidationException extends Exception {


	public PanValidationException() {
	System.out.println("invoked no args of panvalidation");
}
	
	public PanValidationException(String kiran) {
		super(kiran);
	}
}
