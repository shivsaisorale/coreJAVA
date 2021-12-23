package com.xworkx.framework.collection.stream.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollegenameMapScammer {

	public static void main(String[] args) {

		Map<String, Integer> nameAndTotalStudents = new HashMap<String, Integer>();
		nameAndTotalStudents.put("Guru Nanak Dev", 600);
		nameAndTotalStudents.put("Saraswti", 350);
		nameAndTotalStudents.put("BVB", 180);
		nameAndTotalStudents.put("Gurunank", 475);
		nameAndTotalStudents.put("Mahesh", 345);

		Set<String> set = nameAndTotalStudents.keySet();
		set.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));

		System.out.println(System.lineSeparator());

		Collection<Integer> collection = nameAndTotalStudents.values();
		collection.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));

		System.out.println(System.lineSeparator());

		Set<Map.Entry<String, Integer>> entryset = nameAndTotalStudents.entrySet();
		Iterator<Map.Entry<String, Integer>> itr = entryset.iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Integer> element = itr.next();
			System.out.println(element.getKey().concat(":").concat(String.valueOf(element.getValue())));

			System.out.println(System.lineSeparator());

			entryset.forEach(
					(entry) -> System.out.println(entry.getKey().concat(":").concat(String.valueOf(entry.getValue()))));
		}

	}

}
