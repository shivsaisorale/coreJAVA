package com.xworkz.laptop;

public class Laptop {

	public Laptop() {
		System.out.println(this.getClass().getSimpleName().concat("invoke no args of laptop"));
	}

	public void start() {
		System.out.println("invoked start method");

	}
}
