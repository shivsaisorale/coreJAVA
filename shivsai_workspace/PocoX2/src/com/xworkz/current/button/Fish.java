package com.xworkz.current.button;

import Enum.fishtype;

public class Fish {

	String name;
	fishtype TYPE;
	float price;
	String colour;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	@Override
	public String toString() {
		System.out.println("invoked tostring from Shoe");
		return "SSM";
	}
	@Override
	public int hashCode() {
		System.out.println("invoked hashcode from Shoe");
		return 78;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals from Shoe");
		if(obj!=null) {
			
			if(obj instanceof Shoe) {
				
				Fish fish =(Fish)obj;
				String nameref=fish.getColour();
				String type=fish.getColour();
				System.out.println(nameref+"=====");
				System.out.println(type+"=====");
				
				if(type.equals(nameref) && type.equals(type))

		{
			System.out.println("matched");
			return true;
		}
				
			}
		}
		return false;

	}
}
