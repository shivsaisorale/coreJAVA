package com.xworkx.framework.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Pincodes {

	private Collection<String> pincode = new ArrayList<String>();

	public boolean save(String name) {
		return this.pincode.add(name);
	}

	public boolean findMatchName(String pincode) {
		if (pincode != null) {
			if (pincode.contains(pincode)) {
				System.out.println("pincode is matched");
				return true;

			}
		}
		return false;
	}

	public boolean findMatchStartswith(String chars) {
		if (chars != null) {
			Iterator<String> itr = pincode.iterator();
			while (itr.hasNext()) {
				String type = itr.next();
				if (type.toUpperCase().startsWith(chars.toUpperCase())) {
					System.out.println("pincode is matched start with same chars");
					return true;
				}
			}
		}
		return false;
	}

	public boolean findMatchEndswith(String chars) {
		if (chars != null) {
			Iterator<String> itr = pincode.iterator();
			while (itr.hasNext()) {
				String type = itr.next();
				if (type.toUpperCase().endsWith(chars.toUpperCase())) {
					System.out.println("pincode is matched ends with same chars");
					return true;
				}
			}
		}
		return false;
	}

}
