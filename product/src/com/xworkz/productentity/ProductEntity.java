package com.xworkz.productentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="product")
@NamedQueries({
	@NamedQuery(name = "getAll", query = "select all from ProductEntity all where all.name ='getAll'"),
	@NamedQuery(name="getByTotal",query="select price  from ProductEntity price  where price='getTotal'"),
	@NamedQuery(name="getByMaxPrice",query="Select max(price) from ProductEntity"),
	@NamedQuery(name="getByTotalPrice",query="Select sum(price) from ProductEntity"),
	@NamedQuery(name="getByBrand",query="select product.brand from ProductEntity "),
	@NamedQuery(name="getBrandByName",query="from ProductEntity like where like.name=:name"),
	@NamedQuery(name="getNameAndPriceByBrand",query="from ProductEntity like where like.name=:brand"),
	
})
public class ProductEntity {
	
	@Id
	@Column(name="p_id")	
	private int id;
	@Column(name="p_name")	
	private String name;
	@Column(name="p_quantity")
	private int quantity;
	@Column(name="p_brand")
	private String brand;
	@Column(name="p_price")
	private float price;
	@Column(name="p_rating")
	private double rating;

	public ProductEntity(int id,String name, int quantity, String brand, float price, double rating) {
		super();
		this.id=id;
		this.name = name;
		this.quantity = quantity;
		this.brand = brand;
		this.price = price;
		this.rating = rating;
	}

}
