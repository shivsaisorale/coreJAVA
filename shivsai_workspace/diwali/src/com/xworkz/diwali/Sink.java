package com.xworkz.diwali;

public class Sink {

	public String name;
	public String colour;
	public float size;
	public String types;

	public Sink() {
		System.out.println("invoked sink no args");
	}

	public Sink(String name, String colour, float size, String types) {
		super();
		this.name = name;
		this.colour = colour;
		this.size = size;
		this.types = types;
	}

}
