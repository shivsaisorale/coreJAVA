package com.xworkz.passport.constant;

public enum Gender {

	MALE('M'),FEMALE('f'),OTHER('O');
	
	private char gender;
	
	private Gender(char gender) {
		this.gender=gender;
		System.out.println("shotting on gender");
	}
	
	public char getGender() {
		return gender;
	}
}
