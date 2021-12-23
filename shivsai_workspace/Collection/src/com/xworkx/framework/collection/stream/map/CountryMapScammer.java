package com.xworkx.framework.collection.stream.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.sun.javafx.collections.MappingChange.Map;

public class CountryMapScammer {

	public static void main(String[] args) {

		HashMap<String, String> countryMap =  new HashMap<String, String>();

		countryMap.put("Indai", "Karnatak");
		countryMap.put("Brazil", "Brasilia");
		countryMap.put("Canada", "Ontario");
		countryMap.put("China", "Hong Kong");
		countryMap.put("Ethiopia", "Harari");
		countryMap.put("Australia", "Western");

		Set<String> set = countryMap.keySet();
		set.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));
		System.out.println("============");

		Collection<String> collection = countryMap.values();
		collection.forEach((v) -> System.out.println(v));
		System.out.println("===========================");

		Set<Map.Entry<String, String>> entrySet = countryMap.entrySet();

		Iterator<Map.Entry<String, String>> itr = entrySet.iterator();
		while (itr.hasNext()) {
			Map.Entry<String, String> element = itr.next();

			System.out.println(element.getKey().concat(":").concat(element.getValue()));
			System.out.println("=======================");

			entrySet.forEach((entry) -> System.out.println(entry.getKey().concat(":").concat(entry.getValue())));
		}
	}

}
