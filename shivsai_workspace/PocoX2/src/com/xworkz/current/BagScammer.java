package com.xworkz.current;

import com.xworkz.current.button.Bag;

import Enum.BagColour;

public class BagScammer {

	public static void main(String[] args) {
		Bag bag = new Bag();
		String ref = bag.toString();
		bag.setPrice(766.7f);
		bag.setCOLOR(BagColour.BLACK);
		bag.setSections("5");
		
		System.out.println(bag.toString());
		System.out.println(bag.hashCode());
		
		
		System.out.println(ref);
		System.out.println(bag.hashCode());
		System.out.println("the uniqueid of ref is:" + System.identityHashCode(ref));
		bag.setPrice(766.7f);
		bag.setCOLOR(BagColour.BLACK);
		
		Bag bag2 = new Bag();
		System.out.println(bag2);
		System.out.println(bag2.hashCode());
		bag2.setPrice(34.5f);
		
		System.out.println(bag2.toString());
		System.out.println(bag2.hashCode());
		
		
		System.out.println(bag.equals(bag2));
		
	}


	}


