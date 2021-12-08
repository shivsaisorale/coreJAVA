package com.xwork.saloon.shop;

public class GoldFish  {

	public String colour;
	public String size ;
	
	
	public GoldFish() {
		this("red","dappa");
		System.out.println("goldfish colour"+colour);
		
	
	}
	
	public GoldFish(String colour,String size) {
		super();
		System.out.println("goldfish"+colour);
		System.out.println("goldfish"+size);
		
	}
}

