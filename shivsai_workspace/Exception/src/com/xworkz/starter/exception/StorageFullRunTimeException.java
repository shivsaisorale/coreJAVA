package com.xworkz.starter.exception;

public class StorageFullRunTimeException extends RuntimeException {

	public StorageFullRunTimeException() {
		System.out.println("invoked no args og fullruntime exception");
	}
	public StorageFullRunTimeException(String shivu) {
	super();
	}
}
