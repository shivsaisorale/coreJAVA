package com.xworkx.framework.collection.stream.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AadharNumMapScammer {

	public static void main(String[] args) {
		Map<String, String> aadharNoAndName = new HashMap<String, String>();
		aadharNoAndName.put("23455667777", "kiran");
		aadharNoAndName.put("23245675544", "anmol");
		aadharNoAndName.put("41234556788", "Sangu");
		aadharNoAndName.put("156948627139", "gomu");
		aadharNoAndName.put("259784136259", "Abhi");

		Set<String> set = aadharNoAndName.keySet();
		set.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));
		;

		System.out.println("---------------------------");

		Collection<String> collection = aadharNoAndName.values();
		collection.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));

		System.out.println("*******************************");

		Set<Map.Entry<String, String>> entryset = aadharNoAndName.entrySet();
		Iterator<Map.Entry<String, String>> itr = entryset.iterator();
		while (itr.hasNext()) {
			Map.Entry<String, String> element = itr.next();
			System.out.println(element.getKey().concat(":").concat(element.getValue()));

			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

			entryset.forEach((entry) -> System.out.println(entry.getKey().concat(":").concat(entry.getValue())));
		}

	}

}
