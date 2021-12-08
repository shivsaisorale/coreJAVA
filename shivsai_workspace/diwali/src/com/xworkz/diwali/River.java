package com.xworkz.diwali;

public class River {

	public String name;
	public int destination;
	public String origin;
	public float length;
	
	public River() {
		System.out.println("invoked river no args");
	}

	public River(String name, int destination, String origin, float length) {
		super();
		this.name = name;
		this.destination = destination;
		this.origin = origin;
		this.length = length;
	}
	
	
	
}
