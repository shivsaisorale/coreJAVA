package com.xworkz.laptop;

public class Paint {

	public Paint() {
		System.out.println(this.getClass().getName().concat("invoked no args"));
	}

	public Boolean apply() {
		System.out.println("apply the paint");
		return true;
	}

	public String brush() {
		System.out.println("it is brush");
		return "new";
	}
}
