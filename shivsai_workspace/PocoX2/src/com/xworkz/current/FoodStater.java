package com.xworkz.current;

import com.xworkz.current.button.Food;

public class FoodStater {

	public static void main(String[] args) {
		Food food = new Food();
		String ref = food.toString();
		System.out.println(ref);
		System.out.println(food.hashCode());
		System.out.println("the uniqueid of ref is:" + System.identityHashCode(ref));
		food.setPrice(766.7f);

		Food food2 = new Food();
		System.out.println(food2);
		System.out.println(food2.hashCode());
		food2.setPrice(34.5f);

		food.setName("biskit");
		food2.setName("biskit");
	    System.out.println(food.equals(food2));
	}


	}


