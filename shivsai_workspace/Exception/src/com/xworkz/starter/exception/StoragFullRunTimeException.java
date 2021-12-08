package com.xworkz.starter.exception;

public class StoragFullRunTimeException extends RuntimeException {

	public StoragFullRunTimeException() {
		System.out.println("invoked no args of storgefullruntime");
	}
	public StoragFullRunTimeException(String sai) {
	super();
	}
}
