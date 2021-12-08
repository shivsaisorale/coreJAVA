package com.xwork.saloon;

import com.xwork.saloon.shop.Fish;
import com.xwork.saloon.shop.GoldFish;
import com.xwork.saloon.shop.SharkFish;

public class Fishstarter {

	public static void main(String[] args) {
		Fish fish=new Fish();
		System.out.println("this is fish");
		
		SharkFish fish1=new SharkFish();
		System.out.println(fish1.height);
		System.out.println(fish1.weight);
		
	}	
	
}


