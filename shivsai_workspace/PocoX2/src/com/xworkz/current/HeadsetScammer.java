package com.xworkz.current;

import com.xworkz.current.button.Headset;

public class HeadsetScammer {

	public static void main(String[] args) {
		Headset headset = new Headset();
		String ref = headset.toString();
		System.out.println(ref);
		System.out.println(headset.hashCode());
		System.out.println("the uniqueid of ref is:" + System.identityHashCode(ref));
		headset.setBrand("Dell21");

		Headset headset2 = new Headset();
		System.out.println(headset2);
		System.out.println(headset2.hashCode());
		headset2.setBrand("HP122");
		
		headset.setBrand("HP");
		headset2.setBrand("HP");
	    System.out.println(headset.equals(headset2));
	}

}
