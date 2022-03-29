package com.xworkz.groceryapplication.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.groceryapplication.dto.GroceryDTO;
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
			System.out.println("invalid name");
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
		if (valid = true) {
			repo.save(entity);
		}

		return valid;

	}

	public GroceryDTO validateAndfindbyName(String name) {
		boolean valid = false;
		if (name == null || name.isEmpty() == true || name.length() < 3 || name.length() > 20) {
			valid = false;
			System.out.println("Invalid name");
		} else {
			valid = true;
			System.out.println("Valid name");
		}
		if (valid = true) {
			GroceryEntity entity = this.repo.findByName(name);
			GroceryDTO dto = new GroceryDTO();
			dto.setName(entity.getName());
			dto.setQuantity(entity.getQuantity());
			dto.setPrice(entity.getPrice());
			dto.setType(entity.getType());
			dto.setBrand(entity.getBrand());

			return dto;
		}
		return GroceryService.super.validateAndfindByName(name);
	}

	public GroceryDTO validateAndUpdatebyName(String name, String newBrand) {
		boolean valid = false;
		if (name == null || name.isEmpty() == true || name.length() < 3 || name.length() > 20) {
			valid = false;
			System.out.println("Invalid name");
		} else {
			valid = true;
			System.out.println("Valid name");
		}
		if (newBrand == null || newBrand.isEmpty() == true) {
			valid = false;
			System.out.println("Invalid Brand");
		} else {
			valid = true;
			System.out.println("Valid Brand");
		}
		if (valid = true) {
			GroceryEntity entity = this.repo.findByName(name);
			GroceryDTO dto = new GroceryDTO();
			dto.setName(entity.getName());
			dto.setQuantity(entity.getQuantity());
			dto.setPrice(entity.getPrice());
			dto.setType(entity.getType());
			dto.setBrand(entity.getBrand());

			return dto;
		}
		return GroceryService.super.validateAndUpdatebyName(name, newBrand);
	}

	@Override
	public boolean validateAndDelete(String name) {
		System.out.println("invoked validateAndDelete() ");
		boolean result = this.repo.deleteByName(name);
		return result;

	}

	@Override
	public List<Object> getAllGrocery() {
		System.out.println("invoked validateAndDelete() ");
		List<Object> groceryContainer = null;
		List<GroceryEntity> groceryEntityContainer = this.repo.getAll();
		if (groceryEntityContainer != null) {
			return groceryContainer = new ArrayList<Object>(groceryEntityContainer);

		}
		return groceryContainer;

	}
}
