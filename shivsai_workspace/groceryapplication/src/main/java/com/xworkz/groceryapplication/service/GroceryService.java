package com.xworkz.groceryapplication.service;

import java.util.List;

import com.xworkz.groceryapplication.dto.GroceryDTO;
import com.xworkz.groceryapplication.entity.GroceryEntity;

public interface GroceryService {

	boolean validateAndsave(GroceryEntity entity);

	default GroceryDTO validateAndfindByName(String name) {
		return null;
	}

	default GroceryDTO validateAndUpdatebyName(String name, String newBrand) {
		return null;
	}
		boolean validateAndDelete(String name);
		
		List<Object>getAllGrocery();


	}

