package com.xworkz.groceryapplication.repo;

import com.xworkz.groceryapplication.entity.GroceryEntity;

public interface GroceryReposetory {
	void save(GroceryEntity entity);

	default GroceryEntity findByName(String name) {
		return null ;

	}

}
