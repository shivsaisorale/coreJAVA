package com.xworkx.framework.collection.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


	public class BeerDAO {

		private Collection<String> collectionBeer = new ArrayList<String>();

		public BeerDAO() {
			collectionBeer.add("Kingfisher");
			collectionBeer.add("Tuborg");
			collectionBeer.add("Heineken");
			collectionBeer.add("Corona");
			collectionBeer.add("Budweiser");
		}

		public boolean operations(Search option, String value) {
			Iterator<String> itr = collectionBeer.iterator();
			while (itr.hasNext()) {
				String point = itr.next();
				if (option.expression(point, value)) {
					return true;
				}
			}
			return false;
		}
}
