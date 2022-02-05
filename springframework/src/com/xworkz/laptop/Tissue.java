package com.xworkz.laptop;

public class Tissue {

	public Tissue() {
		System.out.println(this.getClass().getName().concat("invoked no args"));
	}
	 public Boolean cleanhand() {
		 System.out.println("using for clean hand");
		 return true;
		 
	 }
	 public String onetimeuse() {
		 System.out.println("it is use one time only");
		return "ok";
	 }
}
