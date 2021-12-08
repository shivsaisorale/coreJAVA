package com.xworkz.crud;

public class ResortStarter {
	
	private String location;
	private String[] resortNames = new String[8];
	private int counter = 0;

	public ResortStarter() {
		this("Bidar");
		System.out.println("Invoked crudopertion no-arg const");
	}

	public ResortStarter(String location) {
		this.location = location;
		System.out.println("Invoked BeachOpertor string const");
	}

	public String getlocation() {
		return location;
	}

	public void addresortName(String name) {
		System.out.println("invoked addresortName");
		System.out.println("Name of arg passed is :".concat(name));
		if (this.counter < 8) {
			this.resortNames[this.counter] = name;
			this.counter++;
		} else {
			System.err.println("array is full,cannot add ");
		}
	}

	public void displayresortName() {
		System.out.println("invoked displayChocolateName");
		for (int room = 0; room < this.resortNames.length; room++) {
			String name = this.resortNames[room];
			System.out.println(name);
		}
	}


	
}
