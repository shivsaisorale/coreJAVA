package com.xworkx.framework.collection.dao;

import java.util.HashSet;
import java.util.Set;

public class MLAS {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("K.R.ramesh");
		set.add("Sudhakara");
		set.add("Basavaraj");
		set.add("Ashoka");
		set.add("Raamulu");

		System.err.println("using for loop");
		for (String element : set) {
			System.out.println(element);
		}
		System.out.println("==========================");
		System.err.println("using forEach method");
		set.forEach((ele) -> {
			System.out.println(ele);
		});
	}

}
