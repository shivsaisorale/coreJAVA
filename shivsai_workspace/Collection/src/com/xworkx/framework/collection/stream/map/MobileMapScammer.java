package com.xworkx.framework.collection.stream.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MobileMapScammer {

	public static void main(String[] args) {

		Map<String, String> mobileNoAndName = new HashMap<String, String>();
		mobileNoAndName.put("8139966651", "kiran");
		mobileNoAndName.put("9108222564", "Anmol");
		mobileNoAndName.put("9243975180", "nikil");
		mobileNoAndName.put("8147585989", "sangujio");
		mobileNoAndName.put("8088068316", "sangu");

		Set<String> set = mobileNoAndName.keySet();
		set.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));
		;

		System.out.println("'''''''''''''''''''''''");

		Collection<String> collection = mobileNoAndName.values();
		collection.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));

		System.out.println("==============================");

		Set<Map.Entry<String, String>> entryset = mobileNoAndName.entrySet();
		Iterator<Map.Entry<String, String>> itr = entryset.iterator();
		while (itr.hasNext()) {
			Map.Entry<String, String> element = itr.next();
			System.out.println(element.getKey().concat(":").concat(element.getValue()));

			System.out.println("****************************");

			entryset.forEach((entry) -> System.out.println(entry.getKey().concat(":").concat(entry.getValue())));
		}

	}

}
