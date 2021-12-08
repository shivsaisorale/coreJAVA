package com.xworkz.current.button;

public class Food {

	String name;
	float price;
	float quantity;
	
	public String getName() {
		return name;
	}
	public void setName(String food) {
		this.name = food;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		System.out.println("invoked tostring from Food");
		return "SSM";
	}
	@Override
	public int hashCode() {
		System.out.println("invoked hashcode from Food");
		return 654;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals from Food");
		if(obj!=null) {
			
			if(obj instanceof Food) {
				
				Food food =(Food)obj;
				String nameref=food.getName();
				String type=food.getName();
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
