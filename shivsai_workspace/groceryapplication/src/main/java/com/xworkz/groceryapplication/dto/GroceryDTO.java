package com.xworkz.groceryapplication.dto;

import javax.persistence.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Entity
@Data
@Getter
@NoArgsConstructor
public class GroceryDTO {

	private	String name;
	private	int quantity;
	private	float price;
	private	String type;
	private	String brand;
	 
	
 
}
