package com.xworkz.cycle.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name="mycycle")

public class CycleEntity {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="types")
	private String types;
	@Column(name="price")
	private float price;
	@Column(name="products")
	private String products;
	@Column(name="city")
	private String city;
	@Column(name="location")
	private String location;
	
	
	public CycleEntity(String name, String types, float price, String products, String city, String location) {
		super();
		this.name = name;
		this.types = types;
		this.price = price;
		this.products = products;
		this.city = city;
		this.location = location;
	}

	
}
