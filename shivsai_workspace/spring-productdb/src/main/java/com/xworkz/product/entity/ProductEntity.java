package com.xworkz.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "product_offers")
public class ProductEntity {
	@Id
	@Column(name = "p_name")
	private String name;
	@Column(name = "p_type")
	private String type;
	@Column(name = "p_quantity")
	private int quantity;
	@Column(name = "p_price")
	private float price;

	public ProductEntity() {
		System.out.println("shooting on product");
	}

	public ProductEntity(String name, String type, int quantity, float price) {
		super();
		this.name = name;
		this.type = type;
		this.quantity = quantity;
		this.price = price;
	}

}
