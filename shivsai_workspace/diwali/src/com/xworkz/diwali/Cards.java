package com.xworkz.diwali;

public class Cards {

	public String name;
	public int noOfblack;
	public int noOfred;
	public String colour;

	public Cards() {
		System.out.println("invoked card no arg");
	}

	public Cards(String name, int noOfblack, int noOfred, String colour) {
		super();
		this.name = name;
		this.noOfblack = noOfblack;
		this.noOfred = noOfred;
		this.colour = colour;
	}
}
