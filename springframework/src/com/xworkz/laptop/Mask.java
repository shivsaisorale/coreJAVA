package com.xworkz.laptop;

public class Mask {

	public Mask() {
		System.out.println(this.getClass().getName().concat("invoked no args"));
	}

	public String selling() {
		System.out.println("its very costly");
		return "shop";
	}

	public boolean stitching() {
		System.out.println("tailors are stitching");
		return false;
	}
}
