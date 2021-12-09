package com.xworkx.framework.list.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhoneNo {

	public static void main(String[] args) {

		List<Long> collection = new LinkedList<Long>();

		collection.add(8139966651l);
		collection.add(9343721317l);
		collection.add(9243975180l);
		collection.add(7276759230l);
		collection.add(9108222564l);
		collection.add(8147585989l);
		collection.add(9110621178l);
		collection.add(8660400865l);
		collection.add(8139966651l);
		collection.add(9845506888l);
		collection.add(9874562587l);

		System.out.println("LIST");
		System.out.println(collection.size());
		Collections.sort(collection);
		System.out.println("acending order....");
		Iterator<Long> itr = collection.iterator();
		while (itr.hasNext()) {
		Long type = itr.next();
		System.out.println(type);
		}

		System.out.println("******************************");
		System.out.println("decending...........");
		Collections.sort(collection, Collections.reverseOrder());
		Iterator<Long> itr1 = collection.iterator();
		while (itr1.hasNext()) {
			Long type = itr1.next();
			System.out.println(type);
		}

		System.err.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");

		System.out.println("SET");
		Set<Long> set1 = new TreeSet<Long>();
		set1.add(8139966651l);
		set1.add(9243975180l);
		set1.add(9876526726l);
		set1.add(9423156789l);
		set1.add(9865346789l);
		set1.add(9483764424l);
		set1.add(7289775623l);
		set1.add(9886288519l);
		set1.add(9180726353l);
		set1.add(9343721317l);

		System.out.println(set1.size());
		System.out.println("acending order....");

		Iterator<Long> itr2 = set1.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		System.out.println("======================");
		System.out.println("descending order....");

		Collections.sort(collection, Collections.reverseOrder());
		Iterator<Long> itr3 = collection.iterator();
		while (itr3.hasNext()) {
			Long type1 = itr3.next();
			System.out.println(type1);
		}

	}
}
