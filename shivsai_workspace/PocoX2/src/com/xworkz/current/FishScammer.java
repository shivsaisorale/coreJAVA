package com.xworkz.current;

import com.xworkz.current.button.Fish;

public class FishScammer {

	public static void main(String[] args) {
		Fish fish = new Fish();
		String ref = fish.toString();
		System.out.println(ref);
		System.out.println(fish.hashCode());
		System.out.println("the uniqueid of ref is:" + System.identityHashCode(ref));
		fish.setName("Star");
	

		Fish fish2 = new Fish();
		System.out.println(fish2);
		System.out.println(fish2.hashCode());
		fish2.setName("star");
		
		fish.setName("star");
		fish2.setName("star");
	    System.out.println(fish.equals(fish2));
		
	}

}
