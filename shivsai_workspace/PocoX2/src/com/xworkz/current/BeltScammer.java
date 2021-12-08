package com.xworkz.current;

import com.xworkz.current.button.Belt;

public class BeltScammer {
	
	public static void main(String args[]) {

	Belt belt = new Belt();
	String ref = belt.toString();
	System.out.println(ref);
	System.out.println(belt.hashCode());
	System.out.println("the uniqueid of ref is:" + System.identityHashCode(ref));
	belt.setName("ta");

	Belt belt2 = new Belt();
	System.out.println("belt2");
	System.out.println(belt2.hashCode());
	belt2.setName("ta");

	belt.setName("TA");
	belt2.setName("TA");
    System.out.println(belt.equals(belt2));
	}
	}