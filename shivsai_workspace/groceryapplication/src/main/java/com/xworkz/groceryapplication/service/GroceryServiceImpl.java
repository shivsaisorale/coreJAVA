package com.xworkz.groceryapplication.service;

import org.springframework.beans.BeanUtils;
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
		if (valid = true) {
			repo.save(entity);
		}

		return valid;
	}

	@Override
	public GroceryEntity validateAndfindByName(String name) {
		boolean valid = true;
		if (name != null && !(name.isEmpty()) && name.length() > 3 && name.length() < 200) {
			valid = true;

		} else {
			System.out.println("Invalid name");
			valid = false;
		}
		if (valid) {
			GroceryEntity entity = this.repo.findByName(name);
			GroceryDTO dto = new GroceryDTO();
			BeanUtils.copyProperties(entity, dto);
//			dto.setName(entity.getName());
//			dto.setPrice(entity.getPrice());
//			dto.setType(entity.getType());
//			dto.setQuantity(entity.getQuantity());
//		
			return entity;
		}
		return null;
		

	}
}
