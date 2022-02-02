package com.xworkz.laptop;

public class Doctor {

	public Doctor() {
		System.out.println(this.getClass().getSimpleName().concat("no arg of doctor"));

	}

	public void treat() {
		System.out.println("invoked start method ");
	}
}
