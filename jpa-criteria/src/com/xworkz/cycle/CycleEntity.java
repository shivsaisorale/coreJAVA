package com.xworkz.cycle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cycle")
public class CycleEntity {
	@Id
	@Column(name = "c_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "c_name")
	private String name;
	@Column(name = "c_types")
	private String types;
	@Column(name = "c_price")
	private float price;
	@Column(name = "c_company")
	private String company;
	
	public CycleEntity() {
		// TODO Auto-generated constructor stub
	}

	public CycleEntity(int id,String name, String types, float price, String company) {
		super();
		this.name = name;
		this.types = types;
		this.price = price;
		this.company = company;
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
