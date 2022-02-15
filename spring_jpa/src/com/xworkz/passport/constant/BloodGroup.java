package com.xworkz.passport.constant;

public enum BloodGroup {

	A_POSITIVIE("a+");
	
private  String bloodGroup ;
	
	private BloodGroup(String bloodGroup) {
		this.bloodGroup=bloodGroup;
		System.out.println("shotting on bloodgrup");
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
}

