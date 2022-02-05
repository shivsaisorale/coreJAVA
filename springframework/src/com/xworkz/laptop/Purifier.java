package com.xworkz.laptop;

public class Purifier {
	Purifier() {
		System.out.println(this.getClass().getName().concat("invoked no args"));
	}

	public String drinkwater() {
		System.out.println("we are driking ");
		return "drink";
	}

	public Boolean cleanwater() {
		System.out.println("clean wter");
		return true;
	}
}
