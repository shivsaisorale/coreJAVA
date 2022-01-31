package com.xworkz.entityscanner;

import java.util.List;

import com.xworkz.productdao.ProductDAO;
import com.xworkz.productdao.ProductDAOImpl;
import com.xworkz.productentity.ProductEntity;



public class ProductScanner {

	public static void main(String[] args) {
		ProductEntity entity1 = new ProductEntity(1, "Maggi", 2, "Nestle", 40.3f, 0.4);
		ProductEntity entity2 = new ProductEntity(2, "Bourbon whiskey", 2, "Orleans", 10000, 0.5);
		ProductEntity entity3 = new ProductEntity(3, "Car", 1, "Hounda",5000000,0.5);
		ProductEntity entity4 = new ProductEntity(4, "Bike", 1, "pulsur",100000, 0.4);
		ProductEntity entity5 = new ProductEntity(5, "Mobile", 1, "poco X2",21000, 0.4);
		ProductEntity entity6 = new ProductEntity(6, "Laptop", 2, "HP",20000, 0.4);
		ProductEntity entity7 = new ProductEntity(7, "Pendro", 2, "HP", 400, 0.4);
		ProductEntity entity8 = new ProductEntity(8, "LED", 2, "samsunge", 400000, 0.4);
		ProductEntity entity9 = new ProductEntity(9, "Camera", 2, "Sony", 40, 0.4);
		ProductEntity entity10 = new ProductEntity(10, "Fan", 2, "Bajaja", 500, 0.4);

		ProductDAO dao = new ProductDAOImpl();
		dao.save(entity1);
		dao.save(entity2);
		dao.save(entity3);
		dao.save(entity4);
		dao.save(entity5);
		dao.save(entity6);
		dao.save(entity7);
		dao.save(entity8);
		dao.save(entity9);
		dao.save(entity10);
		
		List<ProductEntity> list=dao.save();
		dao.saveAll(list);
	
		
		List<ProductEntity> list1=dao.getAll(list1);
		System.out.println(list1);
		
		System.out.println(dao.getByMaxPrice());
		
		System.out.println(dao.getBrandByName("HP"));
		System.out.println(dao.getByBrand("sony"));
		

	}

}
