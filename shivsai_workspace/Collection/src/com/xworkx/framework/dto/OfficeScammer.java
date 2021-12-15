package com.xworkx.framework.dto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class OfficeScammer {

	public static void main(String[] args) {

		OfficeDTO officeDTO1 = new OfficeDTO("DC office", "Hospet Road Koppal", 67, true);

		OfficeDTO officeDTO2 = new OfficeDTO("Income-tax office", "Gandhi chowk", 56, true);

		OfficeDTO officeDTO3 = new OfficeDTO("Taluk-office", "Mahaveer circle", 80, true);

		OfficeDTO officeDTO4 = new OfficeDTO("post office", "Islampur", 50, false);

		OfficeDTO officeDTO5 = new OfficeDTO("sale-tax office", "Koppal", 60, true);

		Set<OfficeDTO> set = new HashSet<OfficeDTO>();
		set.add(officeDTO3);
		set.add(officeDTO2);
		set.add(officeDTO5);
		set.add(officeDTO1);
		set.add(officeDTO4);

		Iterator<OfficeDTO> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
