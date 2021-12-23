package com.xworkx.framework.collection.stream.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MytotalmembersMap {

	public static void main(String[] args) {
		Map<String, String> myfamily = new HashMap<String, String>();
		myfamily.put("Jaganath", "1");
		myfamily.put("Sridevi", "2");
		myfamily.put("Nikita", "3");
		myfamily.put("Kiran", "4");

		Set<String> set = myfamily.keySet();
		set.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));
		;

		System.out.println("---------------------------");

		Collection<String> collection = myfamily.values();
		collection.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));

		System.out.println("*******************************");

		Set<Map.Entry<String, String>> entryset = myfamily.entrySet();
		Iterator<Map.Entry<String, String>> itr = entryset.iterator();
		while (itr.hasNext()) {
			Map.Entry<String, String> element = itr.next();
			System.out.println(element.getKey().concat(":").concat(element.getValue()));

			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

			entryset.forEach((entry) -> System.out.println(entry.getKey().concat(":").concat(entry.getValue())));
		}

	}

}
