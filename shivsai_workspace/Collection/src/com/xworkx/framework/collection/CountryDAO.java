package com.xworkx.framework.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CountryDAO {

	private Collection<String> country = new ArrayList<String>();

	public boolean save(String name) {
		return this.country.add(name);
	}

	public boolean findMatchName(String country) {
		if (country != null) {
			if (country.contains(country)) {
				System.out.println("country is matched");
				return true;

			}
		}
		return false;
	}

	public boolean findMatchCaseInsensitive(String name) {
		if (name != null) {
			Iterator<String> itr = country.iterator();
			while (itr.hasNext()) {
				String type = itr.next();

				if (type.equalsIgnoreCase(name)) {
					System.out.println("country is matched ignore caseignore case");
					return true;
				}
			}
		}
		return false;
	}

	public boolean findMatchStartswith(String chars) {
		if (chars != null) {
			Iterator<String> itr = country.iterator();
			while (itr.hasNext()) {
				String type = itr.next();
				if (type.toUpperCase().startsWith(chars.toUpperCase())) {
					System.out.println("country is matched start with same chars");
					return true;
				}
			}
		}
		return false;
	}

	public boolean findMatchEndswith(String chars) {
		if (chars != null) {
			Iterator<String> itr = country.iterator();
			while (itr.hasNext()) {
				String type = itr.next();
				if (type.toUpperCase().endsWith(chars.toUpperCase())) {
					System.out.println("country is matched ends with same chars");
					return true;
				}
			}
		}
		return false;
	}
}
