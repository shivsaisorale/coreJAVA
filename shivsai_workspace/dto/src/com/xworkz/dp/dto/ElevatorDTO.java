package com.xworkz.dp.dto;

public class ElevatorDTO {

	private String company;
	private String noOfpeople;
	private int flore;
	private float maxWaight;

	public ElevatorDTO() {
		System.out.println("Invoked no-arg const");
	}

	public ElevatorDTO(String company,String noOfpeople, int flore, float maxWaight) {
	
		this.company = company;
		this.noOfpeople = noOfpeople;
		this.flore = flore;
		this.maxWaight = maxWaight;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getNoOfpeople() {
		return noOfpeople;
	}

	public void setNoOfpeople(String noOfpeople) {
		this.noOfpeople = noOfpeople;
	}

	public int getFlore() {
		return flore;
	}

	public void setFlore(int flore) {
		this.flore = flore;
	}

	public float getMaxWaight() {
		return maxWaight;
	}

	public void setMaxWaight(float maxWaight) {
		this.maxWaight = maxWaight;
	}
	
}
