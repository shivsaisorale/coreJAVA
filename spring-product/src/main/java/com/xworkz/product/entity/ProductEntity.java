package com.xworkz.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Data;

@Data
@Entity
@Table(name = "product_deatils")
public class ProductEntity {
	@Id
	@Column(name = "pid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "p_name")
	private String name;
	@Column(name = ",p_type")
	private String type;
	@Column(name = "p_quantity")
	private double quantity;
	@Column(name = "p_price")
	private float price;

	public ProductEntity() {
		System.out.println("shooting on product");
	}

	public ProductEntity(int id, String name, String type, double quantity, float price) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.quantity = quantity;
		this.price = price;
	}

}
