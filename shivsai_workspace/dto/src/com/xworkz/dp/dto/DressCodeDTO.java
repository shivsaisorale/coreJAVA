package com.xworkz.dp.dto;

public class DressCodeDTO {

	private String colour;
	private String cast;
	private String size;
	private String material;
	private float price;
	private boolean gender;
	
	public DressCodeDTO() {
		System.out.println("no argument constructor invoked");
	}

	public DressCodeDTO(String colour, String cast, String size, String material, float price, boolean gender) {
		super();
		this.colour = colour;
		this.cast = cast;
		this.size = size;
		this.material = material;
		this.price = price;
		this.gender = gender;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
 
}
