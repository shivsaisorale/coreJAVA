package com.xworkz.dp.dto;

public class CraneDTO {
	
	private String company;
	private String colour;
	private int noOfOpertors;
	private float hight;

	public CraneDTO() {
		System.out.println("Invoked no-arg const");
	}

	public CraneDTO(String company, String colour, int noOfOpertors, float hight) {
		super();
		this.company = company;
		this.colour = colour;
		this.noOfOpertors = noOfOpertors;
		this.hight = hight;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getNoOfOpertors() {
		return noOfOpertors;
	}

	public void setNoOfOpertors(int noOfOpertors) {
		this.noOfOpertors = noOfOpertors;
	}

	public float getHight() {
		return hight;
	}

	public void setHight(float hight) {
		this.hight = hight;
	}
	
}
	