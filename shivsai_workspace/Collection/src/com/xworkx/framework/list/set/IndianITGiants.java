package com.xworkx.framework.list.set;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class IndianITGiants {

	public static void main(String[] args) {
	
		
			List<String> collection = new LinkedList<String>();

				collection.add("Infosys");
				collection.add("Tata Consultancy");
				collection.add("HCL");
				collection.add("Wipro");
				collection.add("Mphasis");
				collection.add("LTI");
				collection.add("Mindtree ltd");
				collection.add("Hexaware");
				collection.add("Facebook");
				collection.add("Tech mahindra");
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
				set1.add("TCS");
				set1.add("Wipro");
				set1.add("Genpact");
				set1.add("Redmi");
				set1.add("IBM");
				set1.add("Samsung");
				set1.add("Dell");
				set1.add("Acer");
				set1.add("Syntle ");
				set1.add("IGATE");

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
