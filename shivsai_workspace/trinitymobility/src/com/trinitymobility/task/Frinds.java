package com.trinitymobility.task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Frinds {

	public static void main(String[] args) {

		
		Collection<String> collection = new ArrayList<String>();
		collection.add("sangu");
		collection.add("sagar");
		collection.add("raju");
		collection.add("prashant");
		collection.add("kiran");
		collection.add("abhi");
		collection.add("akash");
		collection.add("raghu");
		
		

		System.out.println("num of frd:" + collection.size());
		System.out.println(collection);
		Iterator<String> it77 = collection.iterator();
		while (it77.hasNext()) {
			System.out.println(it77.next());
		}
		boolean check1 = collection.remove("sangu");
		boolean check2 = collection.remove("sagar");
		boolean check3 = collection.remove("raju");
		boolean check4 = collection.remove("prashant");
		boolean check5 = collection.remove("kiran");
		boolean check6 = collection.remove("kiran");
		
	}
}
