package com.xworkz.spring;

public class ToothPaste {

	private String company;
	private double price;
	private boolean offer;
	private double ml;
	private boolean salt;

	public ToothPaste() {
		System.out.println("invoked no-args");
	}

	public ToothPaste(String company, double price, boolean offer, double ml, boolean salt) {

		this.company = company;
		this.price = price;
		this.offer = offer;
		this.ml = ml;
		this.salt = salt;
		System.out.println("invoked company"+company);
	}

}
