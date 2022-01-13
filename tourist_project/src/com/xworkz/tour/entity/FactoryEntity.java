package com.xworkz.tour.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "factory")
public class FactoryEntity {
	@Id
	@Column(name = "f_id")
	private int id;
	@Column(name = "f_name")
	private String name;
	@Column(name = "f_location")
	private String location;
	@Column(name = "f_product")
	private String product;
	@Column(name = "f_ceoName")
	private String ceoName;
	@Column(name = "f_size")
	private int size;

	public FactoryEntity() {
		
	}

	public FactoryEntity(int id, String name, String location, String product, String ceoName,int size) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.product = product;
		this.ceoName = ceoName;
		this. size=size;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getCeoName() {
		return ceoName;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "factory [id=" + id + ", name=" + name + ", location=" + location + ", product=" + product + ", ceoName="
				+ ceoName + "]";
	}

}
