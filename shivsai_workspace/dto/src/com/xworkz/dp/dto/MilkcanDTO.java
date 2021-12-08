package com.xworkz.dp.dto;

public class MilkcanDTO {

	String shape;
	String quality;
	String quantity;
	String colour;
	float price;
	
	public  MilkcanDTO() {
			System.out.println("no argument constructor invoked");

	}

	public MilkcanDTO(String shape, String quality, String quantity, String colour, float price) {
		super();
		this.shape = shape;
		this.quality = quality;
		this.quantity = quantity;
		this.colour = colour;
		this.price = price;
	
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
