package com.xworkx.framework.list.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TrainNum {

	public static void main(String[] args) {
		
		List <Integer> collection = new LinkedList<Integer> ();

		collection.add(123234);
		collection.add(123312);
		collection.add(125513);
		collection.add(126614);
		collection.add(127715);
		collection.add(137716);
		collection.add(147717);
		collection.add(129898);
		collection.add(124899);
		collection.add(126891);
		collection.add(129872);

		System.out.println("LIST");
		System.out.println(collection.size());
		Collections.sort(collection);
		System.out.println("acending order....");
		Iterator<Integer> itr = collection.iterator();
		while (itr.hasNext()) {
			Integer type = itr.next();
		System.out.println(type);
		}

		System.out.println("******************************");
		System.out.println("decending...........");
		Collections.sort(collection, Collections.reverseOrder());
		Iterator<Integer> itr1 = collection.iterator();
		while (itr1.hasNext()) {
			Integer type = itr1.next();
			System.out.println(type);
		}

		System.err.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");

		System.out.println("SET");
		Set<Integer> set1 = new TreeSet<Integer>();
		set1.add(150652);
		set1.add(143241);
		set1.add(128811);
		set1.add(187761);
		set1.add(133344);
		set1.add(127778);
		set1.add(137778);
		set1.add(126788);
		set1.add(132378);
		set1.add(123786);

		System.out.println(set1.size());
		System.out.println("acending order....");

		Iterator<Integer> itr2 = set1.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		System.out.println("======================");
		System.out.println("descending order....");

		Collections.sort(collection, Collections.reverseOrder());
		Iterator<Integer> itr3 = collection.iterator();
		while (itr3.hasNext()) {
			Integer type1 = itr3.next();
			System.out.println(type1);
		}

	}


	}

