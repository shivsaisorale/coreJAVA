package com.xworkz.current.button;

public class Shoe {

	String brand;
	float size;
	String colour;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
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
		return 233;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals from Shoe");
		if(obj!=null) {
			
			if(obj instanceof Shoe) {
				
				Shoe shoe =(Shoe)obj;
				String nameref=shoe.getBrand();
				String type=shoe.getBrand();
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
