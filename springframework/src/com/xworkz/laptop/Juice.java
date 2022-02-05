package com.xworkz.laptop;

public class Juice {

	public Juice() {
		System.out.println(this.getClass().getName().concat("invoked no args"));

	}

	public String hotjuice() {
		System.out.println("i want juice");
		return "hot";

	}

	public String coldjuice() {
		System.out.println("i want coldjuice");
		return null;
	}
}
