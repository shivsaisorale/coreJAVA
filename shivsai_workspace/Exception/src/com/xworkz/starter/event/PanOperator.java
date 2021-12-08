package com.xworkz.starter.event;


import javax.management.RuntimeErrorException;

import com.xworkz.starter.exception.PanValidationException;

public class PanOperator {

	private String[] panoperator=new String[5];
	private int counter =0;
	
	public PanOperator() {
		System.out.println("invoked no args of panoperator");
	}
	
	public void save(String pan)throws PanValidationException{
		if(pan!=null && this.counter<panoperator.length) {
			panoperator[this.counter++]=pan;
			System.out.println("it is full ");
			if(pan.contains("NIBPS")&& pan.endsWith("34545") || pan.endsWith("A")) {
				
			}else {
				System.out.println("show the compile time exception");
				throw new PanValidationException();
			}
		}else {
			System.err.println("show the run time exception");
			throw new RuntimeErrorException(null);
			
		}
	}
}
