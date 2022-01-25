package com.xworkz.productdao;

import java.util.List;

import com.xworkz.productentity.ProductEntity;

public interface ProductDAO {

	List<ProductEntity> saveAll(List<ProductEntity> entities);

	void save(ProductEntity entity);

	ProductEntity getByMaxPrice();

	ProductEntity getTotalPrice();

	List<ProductEntity> getAll(List<ProductEntity> entities);

	ProductEntity getByBrand(String brand);

	String getBrandByName(String name);

	Object[] getNameAndPriceByBrand(String brand);

}
