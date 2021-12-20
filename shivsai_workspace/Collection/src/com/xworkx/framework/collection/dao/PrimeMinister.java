package com.xworkx.framework.collection.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PrimeMinister {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Narendra Modi");
		list.add("Manmohan Singh");
		list.add("Indira Gandhi");
		list.add("Lal Bahadur");
		list.add("Jawaharlal Nehru");

		System.out.println("using for loop");
		for (String element : list) {
			System.out.println(element);
		}
		System.out.println("==========================");
		System.out.println("using forEach method");
		list.forEach((ele) -> {
			System.out.println(ele);
		});
		System.out.println("===================");

		ListIterator<String> listIterator = list.listIterator(list.size());
		System.err.println("using List Iterator reverse order using ref size");
		while (listIterator.hasPrevious()) {
			String str = listIterator.previous();
			System.out.println(str);
		}
		System.out.println("==========================");
		System.err.println("using list Iterator order");
		ListIterator<String> listIterator1 = list.listIterator();
		while (listIterator1.hasNext()) {
			String str1 = listIterator1.next();
			System.out.println(str1);
		}

	}

}
