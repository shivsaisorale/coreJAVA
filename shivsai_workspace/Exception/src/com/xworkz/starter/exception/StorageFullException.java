package com.xworkz.starter.exception;

public class StorageFullException extends RuntimeException {

	public StorageFullException() {
		System.out.println("invoked no args it is fullExpe");
	}
	
	public StorageFullException(String poco) {
		super(poco);
	}
	
}
