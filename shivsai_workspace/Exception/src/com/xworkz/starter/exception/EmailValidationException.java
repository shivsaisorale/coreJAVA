package com.xworkz.starter.exception;

public class EmailValidationException extends Exception{

	public EmailValidationException() {
		super();
		System.out.println("invoked no args ");
	}
	
	public EmailValidationException(String msg) {
		super(msg);
	}
}
