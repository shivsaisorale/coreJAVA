package com.xworkz.current.button;

public class PhilipIron extends IronBox {
	
	public PhilipIron() {
		System.out.println("invoked philip no args");;
		
	}

	public PhilipIron(String brand,String type,boolean working,double minTemp,double maxtemp) {
		super(brand, type, working, minTemp,maxtemp);
	}
	public void displayDetails() {
		System.out.println(super.getBrand());
		System.out.println(super.getMaxtemp());
		System.out.println(super.getMintemp());
		System.out.println(super.getType());
		System.out.println(super.isWork());
		}
	public void produceHeat()
	{
		System.out.println("invoked produceheat from philiIron");
		
	}
}