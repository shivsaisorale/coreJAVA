package com.xworkx.framework.collection.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class BiscuitDAO {

	private Collection<String> biscuitCollections = new ArrayList();

	public BiscuitDAO() {
		this.biscuitCollections.add("Hide seek");
		this.biscuitCollections.add("Burboun");
		this.biscuitCollections.add("Parle-G");
		this.biscuitCollections.add("Oreo");
		this.biscuitCollections.add("Monaco");
	}

	public boolean Find(StringMatch search, String value) {
		Iterator<String> itr = biscuitCollections.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			if (search.evaluate(element, value)) {
				return true;
			}

		}
		return false;
	}

}
