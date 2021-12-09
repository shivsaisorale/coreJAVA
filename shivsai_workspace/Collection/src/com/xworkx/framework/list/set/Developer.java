package com.xworkx.framework.list.set;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Developer {

	public static void main(String[] args) {

		List<String> collection = new LinkedList<String>();

		collection.add("Shivsai");
		collection.add("Shiv");
		collection.add("sai");
		collection.add("Kiran");
		collection.add("saikiran");
		collection.add("Shivu");
		collection.add("Sangu");
		collection.add("rani");
		collection.add("Raj");
		collection.add("Gomu");
		collection.add("Abhi");

		System.out.println("LIST");
		System.out.println(collection.size());
		Collections.sort(collection);
		System.out.println("acending order....");
		Iterator<String> itr = collection.iterator();
		while (itr.hasNext()) {
			String type = itr.next();
			System.out.println(type);
		}

		System.out.println("******************************");
		System.out.println("decending...........");
		Collections.sort(collection, Collections.reverseOrder());
		Iterator<String> itr1 = collection.iterator();
		while (itr1.hasNext()) {
			String type = itr1.next();
			System.out.println(type);
		}

		System.err.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");

		System.out.println("SET");
		Set<String> set1 = new TreeSet<String>();
		set1.add("Shivsai");
		set1.add("Shivu");
		set1.add("sai");
		set1.add("Shivya");
		set1.add("ahi");
		set1.add("Rakesh");
		set1.add("Ayappa");
		set1.add("Shivsai");
		set1.add("Omkar sir");
		set1.add("Shivsai");

		System.out.println(set1.size());
		System.out.println("acending order....");

		Iterator<String> itr2 = set1.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		System.out.println("======================");
		System.out.println("descending order....");

		Collections.sort(collection, Collections.reverseOrder());
		Iterator<String> itr3 = collection.iterator();
		while (itr3.hasNext()) {
			String type1 = itr3.next();
			System.out.println(type1);
		}

	}

}
