package com.xworkz.current.button;

public class IronBox {
	
	private String brand;
	private String type;
	private boolean work;
	private double mintemp;
	private double maxtemp;
	
	protected IronBox() {
		super();
		System.out.println("invoked no-arg const of IronBox");
		}

	public IronBox(String brand, String type, boolean work, double mintemp, double maxtemp) {
		super();
		this.brand = brand;
		this.type = type;
		this.work = work;
		this.mintemp = mintemp;
		this.maxtemp = maxtemp;
	}

	protected String getBrand() {
		return brand;
	}

	protected String getType() {
		return type;
	}

	protected boolean isWork() {
		return work;
	}

	protected double getMintemp() {
		return mintemp;
	}

	protected double getMaxtemp() {
		return maxtemp;
	}
	
}
