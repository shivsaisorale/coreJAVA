package com.xworkz.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.product.entity.ProductEntity;
import com.xworkz.product.repository.ProductRepository;

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

		if ((entity.getName() != null && !(entity.getName().isEmpty()) && entity.getName().length() > 5
				&& entity.getName().length() < 30)) {
			valid = true;
			System.out.println(entity.getName());
		} else {
			System.out.println("invalid name");
			valid = false;
			return valid;
		}
		if (entity.getType() != null && entity.getType().length() > 6 && entity.getType().length() < 100) {
			valid = true;
			System.out.println(entity.getType());

		} else {
			System.out.println("Invalid product type");
			valid = false;
			return valid;
		}
		if (entity.getPrice() !=0) {
			valid = true;

		} else {
			System.out.println("Invalid  price");
			valid = false;
			return valid;
		}
////		if (entity.getQuantity() != null  {
////			valid = true;
////		} else {
////			System.out.println("Invalid  Quantity type");
////			valid = false;
////			return valid;
//
//		}
		if (valid) {
			repo.save(entity);
		}

		return false;
	}
}