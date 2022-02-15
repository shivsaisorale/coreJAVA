package com.xworkz.passport.constant;

public enum BloodGroup {

	A_POSITIVIE("a+"),B_POSITIVE("b+");
	
private  String bloodGroup ;
	
	private BloodGroup(String bloodGroup) {
		this.bloodGroup=bloodGroup;
		System.out.println("shotting on gender");
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
}

