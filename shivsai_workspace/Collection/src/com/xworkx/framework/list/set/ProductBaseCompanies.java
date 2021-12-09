package com.xworkx.framework.list.set;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ProductBaseCompanies {

	public static void main(String[] args) {

		List<String> collection = new LinkedList<String>();

		collection.add("Microsoft");
		collection.add("Adobe");
		collection.add("VMware");
		collection.add("Intel");
		collection.add("Intuit");
		collection.add("Amdocs");
		collection.add("McAfee");
		collection.add("Flipkrt");
		collection.add("Facebook");
		collection.add("Amazone");
		collection.add("Salesforce");

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
		set1.add("Google");
		set1.add("Wipro");
		set1.add("Infosys");
		set1.add("TCS");
		set1.add("IBM");
		set1.add("SAP");
		set1.add("Dell");
		set1.add("Oracle");
		set1.add("CISCO ");
		set1.add("HP");

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
