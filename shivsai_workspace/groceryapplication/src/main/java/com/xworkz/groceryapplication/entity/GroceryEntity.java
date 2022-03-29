package com.xworkz.groceryapplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "grocery")
@NamedQueries({@NamedQuery(name = "validateAndByName" ,query="select grocery from GroceryEntity as grocery where grocery.name=:nm")})
public class GroceryEntity {
	@Id
	@Column(name = "g_id")
	private int id;
	@Column(name = "g_name")
	private String name;
	@Column(name = "g_quantity")
	private int quantity;
	@Column(name = "g_price")
	private float price;
	@Column(name = "g_type")
	private String type;
	@Column(name = "g_brand")
	private String brand;
	

	public GroceryEntity() {
		System.out.println("shooting on grocery");
	}

	public GroceryEntity(String name, int quantity, float price, String type, String brand) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.type = type;
		this.brand = brand;
	}

}
