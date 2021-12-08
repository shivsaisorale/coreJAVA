package com.xworkz.current.button;

public class Belt {

	float price;
	int size;
	boolean gender;
	String name;
	
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
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
	@Override
	public String toString() {
		System.out.println("invoked tostring from Belt");
		return "SSM";
	}
	@Override
	public int hashCode() {
		System.out.println("invoked hashcode from Belt");
		return 233;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals from Belt");
		if(obj!=null) {
			
			if(obj instanceof Belt) {
				
				Belt belt =(Belt)obj;
				String nameref=belt.getName();
				String type=belt.getName();
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
