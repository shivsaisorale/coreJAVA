package com.xworkz.current;

import com.xworkz.current.button.Stadium;

public class StadiumStarter {

	public static void main(String[] args) {
		Stadium stadium = new Stadium();
		String ref = stadium.toString();
		System.out.println(ref);
		System.out.println(stadium.hashCode());
		System.out.println("the uniqueid of ref is:" + System.identityHashCode(ref));
		stadium.setName("kenpegoda");

		Stadium stadium2 = new Stadium();
		System.out.println(stadium2);
		System.out.println(stadium2.hashCode());
		stadium2.setName("kenpegoda");
	}
}


