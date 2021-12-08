package com.xworkz.crud;

public class GinCrud {


	private String whisky;
	private String[] whiskyNames = new String[8];
	private int count = 0;

	public GinCrud() {
		this("Bourbon");
		System.out.println("Invoked crudopertion no-arg const");
	}

	public GinCrud(String testy) {
		this.whisky = whisky;
		System.out.println("Invoked BeachOpertor string const");
	}

	public String getwhisky() {
		return whisky;
	}

	public void addwhiskyName(String name) {
		System.out.println("invoked addwhiskyName");
		System.out.println("Name of arg passed is :".concat(name));
		if (this.count < 8) {
			this.whiskyNames[this.count] = name;
			this.count++;
		} else {
			System.err.println("array is full,cannot add ");
		}
	}

	public void displaywhiskyName() {
		System.out.println("invoked displaywhiskyName");
		for (int pickle = 0; pickle < this.whiskyNames.length; pickle++) {
			String name = this.whiskyNames[pickle];
			System.out.println(name);
		}
	
}
}
