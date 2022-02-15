package com.xworkz.passport.constant;

public enum PassportPersonnelType {

	REGULER("R"),DIPLOMATIC("D");
	
	private String passportPersonnelType;
	
	private PassportPersonnelType(String passportPersonnelType) {
	this.passportPersonnelType=passportPersonnelType;
	
		System.out.println("shotting on type");
	}
	public String getPassportPersonnelType() {
		return passportPersonnelType;
	}
}
