package com.xworkz.current;

import com.xworkz.current.button.Plant;

public class PlantScammer {

	public static void main(String[] args) {
		Plant plant = new Plant();
		String ref = plant.toString();
		System.out.println(ref);
		System.out.println(plant.hashCode());
		System.out.println("the uniqueid of ref is:" + System.identityHashCode(ref));
		plant.setLifeSpan("ddf");

		Plant plant2 = new Plant();
		System.out.println(plant2);
		System.out.println(plant2.hashCode());
		plant2.setLifeSpan("sdfg");
		
		plant.setName("aladamara");
		plant2.setName("aladamara");
	    System.out.println(plant.equals(plant2));
		
	}


	}


