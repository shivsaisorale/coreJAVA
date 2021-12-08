package com.xworkz.current;

import com.xworkz.current.button.IceCream;

public class IceCreamScammer {

	public static void main(String[] args) {
		
		IceCream icecream=new IceCream();
		IceCream icecream1=new IceCream();
		System.out.println(icecream);
		System.out.println(icecream1);
		System.out.println(icecream.toString());
		
		System.out.println(icecream1.hashCode());
		
		
		icecream.setName("kone");
		icecream.setName("kone");
		icecream.setType("straberry");
		icecream1.setType("straberry");
		System.out.println(icecream.equals(icecream1));
	
		icecream.setName("star");
		icecream1.setName("star");
	    System.out.println(icecream.equals(icecream1));
		
	}

}
