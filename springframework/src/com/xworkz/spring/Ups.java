package com.xworkz.spring;

public class Ups {

	private String company;
	private String type;
	private float weight;
	private double backupHours;
	private double chargeHours;

	public Ups(String company, String type, float weight, double backupHours, double chargeHours) {
		super();
		this.company = company;
		this.type = type;
		this.weight = weight;
		this.backupHours = backupHours;
		this.chargeHours = chargeHours;
		System.out.println("invoked parameter company" + company);
		System.out.println("invoked parameter type" + type);
		System.out.println("invoked parameter weight" + weight);
		System.out.println("invoked parameter backupHours" + backupHours);
		System.out.println("invoked parameter chargeHours" + chargeHours);

	}

}
