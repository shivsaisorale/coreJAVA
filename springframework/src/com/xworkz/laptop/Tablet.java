package com.xworkz.laptop;

public class Tablet {

	public Tablet() {
		System.out.println(this.getClass().getName().concat("invoked no args"));
	}

	public Boolean eat() {
		System.out.println("we are eating tablets ");
		return false;
	}
		
		public String recover () {
		System.out.println("it is recover");
		return "coverd";	
		}
	
}
