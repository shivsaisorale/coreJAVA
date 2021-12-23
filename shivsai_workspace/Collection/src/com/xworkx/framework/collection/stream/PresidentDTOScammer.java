package com.xworkx.framework.collection.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PresidentDTOScammer {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		PresidentDTO presidentDTO1 = new PresidentDTO("1", "Sarvepalli Radhakrishnan", "India",
				"13 May 1962 - 13 May 1967");
		PresidentDTO presidentDTO2 = new PresidentDTO("2", "Rajendra Prasad ", " India", " 13 May 1962 - 13 May 1957");
		PresidentDTO presidentDTO3 = new PresidentDTO("3", "John Admas", "India", "4 March 1797 - 4 March 1801 ");
		PresidentDTO presidentDTO4 = new PresidentDTO("4", "James Madison", "America ", "4 March 1807 - 4 March 1817 ");
		PresidentDTO presidentDTO5 = new PresidentDTO("5", "Zakir Hussain", "India ", "13 May 1967 - 3 May 1969 ");

		List<String> temp1 = Stream.of(presidentDTO1, presidentDTO2, presidentDTO3, presidentDTO4, presidentDTO5)
				.map((e) -> e.getTenure()).collect(Collectors.toList());
		temp1.forEach((e) -> System.out.println("president Tenure :" + e));

		System.err.println("===================================");

		List<String> temp2 = Stream.of(presidentDTO1, presidentDTO2, presidentDTO3, presidentDTO4, presidentDTO5)
				.map((e) -> e.getName()).collect(Collectors.toList());
		temp2.forEach((e) -> System.out.println("president Name :" + e));

		List<PresidentDTO> president = new ArrayList<PresidentDTO>();

		president.add(presidentDTO1);
		president.add(presidentDTO2);
		president.add(presidentDTO3);
		president.add(presidentDTO4);
		president.add(presidentDTO5);

		Iterator<PresidentDTO> itr = president.iterator();
		while (itr.hasNext()) {
			PresidentDTO element = itr.next();
			System.out.println(element);
			
		Comparator<PresidentDTO> comparator = (e1,e2)->{
			int e1Tenure=e1.getId();
			int e1Tenure=e2.getId();
			if (e1Tenure=e2Tenure)return 0;
			if (e1Tenure<e2Tenure)return 1000;
			if (e1Tenure=e2Tenure)return -100;
			return 0;
			
		};
		
		}

	}

}
