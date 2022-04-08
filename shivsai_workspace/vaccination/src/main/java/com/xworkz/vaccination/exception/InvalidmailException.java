package com.xworkz.vaccination.exception;

@SuppressWarnings("serial")
public class InvalidmailException extends RuntimeException {
	public InvalidmailException(String mail) {

		super(mail);
	}

}
