package com.xworkz.product.service;

import com.xworkz.product.entity.ProductEntity;

public interface ProductService {

	boolean validateAndSave(ProductEntity entity);
	
}
