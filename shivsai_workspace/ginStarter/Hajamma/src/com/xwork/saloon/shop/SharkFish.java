package com.xwork.saloon.shop;

public class SharkFish extends Fish {

	public float height;
	public float weight ;
	
	public SharkFish() {
		this(13.4f,34.5f);
		System.out.println("sharkfish is in water");
	
	}
	
	public SharkFish(float height,float weight) {
		super();
		System.out.println("shark"+height);
		System.out.println("shark"+weight);
		
	}
}
