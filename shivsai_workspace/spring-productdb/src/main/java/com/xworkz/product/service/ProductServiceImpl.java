package com.xworkz.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.product.entity.ProductEntity;
import com.xworkz.product.repo.ProductRepository;

@Component
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository repo;

	public ProductServiceImpl(ProductRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(ProductEntity entity) {
		boolean valid = false;

		if ((entity.getName() != null && !(entity.getName().isEmpty()) && entity.getName().length() > 3
				&& entity.getName().length() < 100)) {
			valid = true;
			System.out.println(entity.getName());

		} else {
			System.out.println("Invalid Name");
			valid = false;
			return valid;
		}
		if (entity.getType() != null && !(entity.getType().isEmpty()) && entity.getType().length() > 3
				&& entity.getType().length() < 90) {
			valid = true;
			System.out.println(entity.getType());

		} else {
			System.out.println("Invalid product type");
			valid = false;
			return valid;
		}
		if (entity.getPrice() != 0) {
			valid = true;
			System.out.println(entity.getPrice());

		} else {
			System.out.println("Invalid  price");
			valid = false;
			return valid;
		}
		if (entity.getQuantity() != 0) {
			valid = true;
			System.out.println(entity.getQuantity());
		} else {
			System.out.println("Invalid  Quantity ");
			valid = false;
			return valid;

		}
		if (valid) {
			repo.save(entity);
		}

		return false;
	}

}
