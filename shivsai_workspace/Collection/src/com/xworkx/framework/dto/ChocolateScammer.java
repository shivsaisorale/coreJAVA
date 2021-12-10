package com.xworkx.framework.dto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ChocolateScammer {

	public static void main(String[] args) {

		ChocolateDTO chocolateDTO1 = new ChocolateDTO("Cadbury", "Dairy Milk", 40, 100.0f);

		ChocolateDTO chocolateDTO2 = new ChocolateDTO("Cadbury", "Eclairs", 10, 50.0f);

		ChocolateDTO chocolateDTO3 = new ChocolateDTO("Cadbury", "Gems", 10, 150.0f);

		ChocolateDTO chocolateDTO4 = new ChocolateDTO("Cadbury", "Heroes", 40, 100.0f);

		Set<ChocolateDTO> set = new HashSet<ChocolateDTO>();
		set.add(chocolateDTO4);
		set.add(chocolateDTO3);
		set.add(chocolateDTO2);
		set.add(chocolateDTO1);

		Iterator<ChocolateDTO> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
