package com.xworkz.phonedirectory.dto;

import lombok.Data;

@Data
public class PhoneDirectoryDTO {


private	String name;
private	long mobileNo;
private	String adress;
private	String landMark;
private	long landline;
private	String city;
private	int pincode;

public PhoneDirectoryDTO(String name, long mobileNo, String adress, String landMark, long landline, String city,
		int pincode) {
	super();
	
	this.name = name;
	this.mobileNo = mobileNo;
	this.adress = adress;
	this.landMark = landMark;
	this.landline = landline;
	this.city = city;
	this.pincode = pincode;
}
	
	
	
}
