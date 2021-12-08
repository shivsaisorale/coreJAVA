package com.xworkz.current;

import com.xworkz.current.button.City;

public class CityStarter {

	public static void main(String[] args) {
		City city = new City();
		String ref = city.toString();
		System.out.println(ref);
		System.out.println(city.hashCode());
		System.out.println("the uniqueid of ref is:" + System.identityHashCode(ref));
		city.setName("kenpegoda");

		City city2 = new City();
		System.out.println(city2);
		System.out.println(city2.hashCode());
		city2.setName("kenpegoda");
	
	
	city.setStateName("KA");
	city2.setStateName("KA");
    System.out.println(city.equals(city2));
	}
}

