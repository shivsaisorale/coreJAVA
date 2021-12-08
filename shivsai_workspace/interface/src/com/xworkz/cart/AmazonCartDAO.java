package com.xworkz.cart;

public interface AmazonCartDAO {

	boolean save(CartDTO cartDTO);

	CartDTO findByName(String name);

	void displayAllCartDetails();

}
