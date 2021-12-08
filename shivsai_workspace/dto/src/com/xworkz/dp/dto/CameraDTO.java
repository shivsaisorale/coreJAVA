package com.xworkz.dp.dto;

public class CameraDTO {

	private String type;
	private String company;
	private String pixel;
	private float cost;
	private float weight;
	
	public CameraDTO() {
		System.out.println("no argument constructor invoked");
	}

	public CameraDTO(String type, String company, String pixel, float cost, float weight) {
		super();
		this.type = type;
		this.company = company;
		this.pixel = pixel;
		this.cost = cost;
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPixel() {
		return pixel;
	}

	public void setPixel(String pixel) {
		this.pixel = pixel;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
}
