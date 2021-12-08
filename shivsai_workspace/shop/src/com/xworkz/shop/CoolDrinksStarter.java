package com.xworkz.shop;

import com.xworkz.shop.curdopartion.CoolDrinks;

public class CoolDrinksStarter {

	public static void main(String[] args) {
		
		CoolDrinks coolDrinks=new CoolDrinks();
		coolDrinks.addCoolDrinkNames("7 up");
		coolDrinks.addCoolDrinkNames("coca");
		coolDrinks.addCoolDrinkNames("pepusi");
		coolDrinks.addCoolDrinkNames("frooty");
		coolDrinks.addCoolDrinkNames("maaza");
		coolDrinks.addCoolDrinkNames("jeera");
		coolDrinks.addCoolDrinkNames("string");
		coolDrinks.addCoolDrinkNames("sprite");
		coolDrinks.addCoolDrinkNames("limka");
		
		coolDrinks.delete(2);
	//	coolDrinks.update(2,"maaza");
		String[] array = coolDrinks.getCoolDrinkNames();
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		
	}

}
