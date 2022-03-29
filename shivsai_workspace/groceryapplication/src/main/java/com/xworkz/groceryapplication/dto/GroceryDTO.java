package com.xworkz.groceryapplication.dto;



import lombok.Data;

import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
public class GroceryDTO {

	private	String name;
	private	int quantity;
	private	float price;
	private	String type;
	private	String brand;
	
	
	public GroceryDTO(String name, int quantity, float price, String type, String brand) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.type = type;
		this.brand = brand;
	}
	 
	
 
}
