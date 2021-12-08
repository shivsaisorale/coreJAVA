package com.xworkz.crud;

public class Island {
	

	private String country;
	private String[] islandNames = new String[5];
	private int counter = 0;

	public Island() {
		this("National"); // this();
		System.out.println("Invoked Island no-arg const");
	}

	public Island(String country) {
		this.country = country;
		System.out.println("Invoked Island string const");
	}

	public String getCountry() {
		return country;
	}

	public void addislandName(String name) {
		System.out.println("invoked addislandName");
		System.out.println("Name of arg passed is :".concat(name));
		if (this.counter < 5) {
			this.islandNames[this.counter] = name;
			this.counter++;
		} 
		else {
			System.err.println("array is full,cannot add go do what ever you want");
		}
	}

	public void displayislandName() {
		System.out.println("invoked displayislandName");
		for (int city = 0; city < this.islandNames.length; city++) {
			String name = this.islandNames[city];
			System.out.println(name);
		}
	}

}