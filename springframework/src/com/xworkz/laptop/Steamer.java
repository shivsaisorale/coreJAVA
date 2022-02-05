package com.xworkz.laptop;

public class Steamer {

	public Steamer() {
		System.out.println(this.getClass().getName().concat("invoked no args"));
	}

	public boolean clean() {
		System.out.println("it is clean");
		return false;
	}

	public String heat() {
		System.out.println("it is heat");
		return "garm";
	}
}
