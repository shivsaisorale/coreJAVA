package com.xworkz.laptop;

public class Oximeter {

	public Oximeter() {
		System.out.println(this.getClass().getName().concat("invoked no args"));
	}

	public boolean skinthickness() {
		System.out.println("it is skinthckness");
		return true;
	}
	public String detectvirus() {
		System.out.println("it is detectvirus");
		return "virus";
	}
}
