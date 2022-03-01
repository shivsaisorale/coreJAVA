package com.xworkz.exam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collect {

	public static void main(String[] args) {

		Collection<String> collect= new ArrayList<String>();
		collect.add("salman");
		collect.add("punit");
		collect.add("rajkumar");
		collect.add("ajay");
		
		Iterator<String> itr= collect.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		
	}

}
