package com.xworkz.facebook.appliction;

public class FacebookApplictionDTO {
	
	String ceoName;
	String headQuarter;
	
	public FacebookApplictionDTO() {
		System.out.println("Invoked  no-arg const");
	}

	public FacebookApplictionDTO(String ceoName, String headQuarter) {
		super();
		this.ceoName = ceoName;
		this.headQuarter = headQuarter;
	}

	public String getCeoName() {
		return ceoName;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}

	public String getHeadQuarter() {
		return headQuarter;
	}

	public void setHeadQuarter(String headQuarter) {
		this.headQuarter = headQuarter;
	}
	
}
