package com.xworkz.starter.event;

import javax.management.RuntimeErrorException;


import com.xworkz.starter.exception.VehicleNumValidation;


public class VehicleNumOperator {

	private String[] vehiclenum=new String[7];
	private int counter =0;
	
	public VehicleNumOperator() {
		System.out.println("invoked no args of vehiclenum");
	}
	

	public void save(String bike)throws VehicleNumValidation {
		if(bike!=null && this.counter<vehiclenum.length) {
			vehiclenum[this.counter++]=bike;
		System.out.println("value is in memory or it is full");
		if(bike.contains("KA") && bike.endsWith("jT") || bike.endsWith("5657")) {
		
		}else {
			System.out.println("show the compile time validationexception");
			throw new VehicleNumValidation();
		}
	}else {
		System.err.println("show the run time exception");
		throw new RuntimeErrorException(null);
	}

	}
}

