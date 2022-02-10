package com.xworkz.spring;

public class Charger {

	private String brand;
	private double price;
	private String color;
	private double volt;
	private boolean working;

	public Charger() {
		System.out.println(this.getClass().getSimpleName().concat("invoked no-args"));

	}

	public Charger(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
		System.out.println("invoked charger parameter" + brand);
		System.out.println("invoked charger parameter" + price);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
		System.out.println(color);
	}

	public double getVolt() {
		return volt;
	}

	public void setVolt(double volt) {
		this.volt = volt;
		System.out.println(volt);

	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
		System.out.println(working);

	}

}