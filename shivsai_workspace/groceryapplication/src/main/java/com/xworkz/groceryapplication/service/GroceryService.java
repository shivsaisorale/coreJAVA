package com.xworkz.groceryapplication.service;

import com.xworkz.groceryapplication.dto.GroceryDTO;
import com.xworkz.groceryapplication.entity.GroceryEntity;

public interface GroceryService {

	boolean validateAndsave(GroceryEntity entity);

	default GroceryDTO validateAndfindByName(String name) {
		return null;

	}
}
