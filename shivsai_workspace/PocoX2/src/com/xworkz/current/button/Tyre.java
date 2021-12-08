package com.xworkz.current.button;

public class Tyre {
	
	String brand;
	float price;
	String type;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		System.out.println("invoked tostring from Tyre");
		return "SSM";
	}
	@Override
	public int hashCode() {
		System.out.println("invoked hashcode from Tyre");
		return 654;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals from Tyre");
		if(obj!=null) {
			
			if(obj instanceof City) {
				
				Tyre aeroplane =(Tyre)obj;
				String nameref=aeroplane.getBrand();
				String type=aeroplane.getBrand();
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
