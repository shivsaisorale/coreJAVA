package com.xworkz.crud.operator;

public class BeachOperator {

	private String country;
	private String[] beachNames = new String[5];
	private int counter = 0;

	public BeachOperator() {
		this("INDIA"); // this();
		System.out.println("Invoked BeachOpertor no-arg const");
	}

	public BeachOperator(String country) {
		this.country = country;
		System.out.println("Invoked BeachOpertor string const");
	}

	public String getCountry() {
		return country;
	}

	public void addBeachName(String name) {
		System.out.println("invoked addBeachName");
		System.out.println("Name of arg passed is :".concat(name));
		if (this.counter < 5) {
			this.beachNames[this.counter] = name;
			this.counter++;
		} 
		else {
			System.err.println("array is full,cannot add go do what ever you want");
		}
	}

	public void displayBeachName() {
		System.out.println("invoked displayBeachName");
		for (int cake = 0; cake < this.beachNames.length; cake++) {
			String name = this.beachNames[cake];
			System.out.println(name);
		}
	}

}
