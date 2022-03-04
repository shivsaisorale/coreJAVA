package com.xworkz.groceryapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.groceryapplication.entity.GroceryEntity;
import com.xworkz.groceryapplication.repo.GroceryReposetory;

@Component
public class GroceryServiceImpl implements GroceryService {
	@Autowired
	private GroceryReposetory repo;

	public GroceryServiceImpl(GroceryReposetory repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndsave(GroceryEntity entity) {
		boolean valid = false;
		if (entity.getName() != null && entity.getName().length() > 3 && entity.getName().length() < 10) {
			valid = true;
			System.out.println(entity.getName());
		} else {
			System.out.println("invzlide name");
			valid = false;
		}
		if (entity.getQuantity() != 0) {
			valid = true;
			System.out.println(entity.getName());
		} else {
			System.out.println("invzlide quantity");
			valid = false;
		}
		if (entity.getPrice() != 0) {
			System.out.println(entity.getPrice());
		} else {
			System.out.println("invzlide price");
			valid = false;
		}
		if (entity.getType() != null && entity.getType().length() > 3 && entity.getType().length() < 10) {
			valid = true;
			System.out.println(entity.getType());
		} else {
			System.out.println("invzlide Type");
			valid = false;
		}
		if (entity.getBrand() != null && entity.getBrand().length() > 3 && entity.getBrand().length() < 10) {
			valid = true;
			System.out.println(entity.getBrand());
		} else {
			System.out.println("invzlide brand");
			valid = false;
		}
		if (valid=true) {
			repo.save(entity);
		}

		return valid;
	}

}
