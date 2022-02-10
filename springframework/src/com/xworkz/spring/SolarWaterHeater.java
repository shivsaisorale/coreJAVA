package com.xworkz.spring;

public class SolarWaterHeater {

	private double capacity;
	private String brand;
	private String price;
	private boolean coldwater;

	public SolarWaterHeater() {
		System.out.println("invoked no-args");

	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public boolean isColdwater() {
		return coldwater;
	}

	public void setColdwater(boolean coldwater) {
		this.coldwater = coldwater;
	}

}
