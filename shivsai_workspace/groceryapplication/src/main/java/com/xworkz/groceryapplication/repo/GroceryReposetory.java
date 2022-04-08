package com.xworkz.groceryapplication.repo;

import java.util.List;

import com.xworkz.groceryapplication.entity.GroceryEntity;

public interface GroceryReposetory {
	void save(GroceryEntity entity);

	default GroceryEntity findByName(String name) {
		return null;
	}

	default GroceryEntity upadteByName(GroceryEntity entity) {
		return null;
	}

	List<GroceryEntity> getAll();
	boolean deleteByName(String name);

}
