package com.xworkx.framework.collection.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AirportNames {

	public static void main(String[] args) {

		String name = ("Kempegowda International");
		String name1 = ("Mangalore International");
		String name2 = ("Tumukuru");
		String name3 = ("Belagavi Airport");
		String name4 = ("Hubballi Airport");
		String name5 = ("Kalaburagi Airport");
		String name6 = ("Bidar Airport");
		String name7 = ("Raichur Airport");
		String name8 = ("Bijapura Airport");
		String name9 = ("Jindal Vijaynagar Airport");
		String name11 = ("Kempegowda International");
		String name12 = ("Mangalore International");
		String name13 = ("Tumukuru Airport");
		String name14 = ("Belagavi Airport");
		String name15 = ("Hubballi Airport");
		String name16 = ("Kalaburagi Airport");
		String name17 = ("Bahhrain Airport");
		String name18 = ("Raichur Airport");
		String name19 = ("Sijapura Airport");
		String name20 = ("Jindal Vijaynagar");

		Stream<String> airport = Stream.of(name,"Kempegowda International", "Mangalore International", "Tumukuru",
				"Belagavi Airport", "Hubballi", "Kalaburagi", "Bidar Airport", "Raichur", "Bijapura",
				"Jindal Vijaynagar", "Mangalore International", "Belagavi", "Hubbali", "Kalaburagi", "Bidar Airport",
				"Raichur", "Bijapur","Sijapura Airport");

		List<String> list = airport.filter(b -> b.startsWith("B")).collect(Collectors.toList());
		list.forEach(e -> System.out.println(e));
	
	}

}
