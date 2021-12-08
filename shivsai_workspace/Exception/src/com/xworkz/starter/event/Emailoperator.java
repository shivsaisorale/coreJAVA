package com.xworkz.starter.event;

import javax.management.RuntimeErrorException;

import com.xworkz.starter.exception.EmailValidationException;

public class Emailoperator {

	private String[] emailop=new String[6];
	private int counter =0;
	
	public Emailoperator() {
		System.out.println("invoked no args of emailoperator");
	}
	

	public void save(String email)throws EmailValidationException {
		if(email!=null && this.counter<emailop.length) {
			emailop[this.counter++]=email;
		System.out.println("value is in memory or it is full");
		if(email.contains("@") && email.endsWith(".com") || email.endsWith(".in")) {
		
		}else {
			System.out.println("show the compile time exception");
			throw new EmailValidationException();
		}
	}else {
		System.err.println("show the run time exception");
		throw new RuntimeErrorException(null);
	}

	}
}


