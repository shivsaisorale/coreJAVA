package com.xworkz.tour.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cugarCane")

public class SugarCaneEntity {

	@Id
	@Column(name = "c_id")
	private int id;
	@Column(name = "c_name")
	private String name;
	@Column(name = "c_factoryName")
	private String factoryName;
	@Column(name = "c_quantity")
	private int quatity;
	@Column(name = "r_cityName")
	private String cityName;
	@Column(name = "r_size")
	private String size;
	@Column(name = "r_price")
	private float price;

	public SugarCaneEntity() {
		
	}

	public SugarCaneEntity(int id, String name, String factoryName, int quatity, String cityName,String size,float price) {
		super();
		this.id = id;
		this.name = name;
		this.factoryName = factoryName;
		this.quatity = quatity;
		this.cityName = cityName;
		this.size=size;
		this.price=price;
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

	public String getFactoryName() {
		return factoryName;
	}

	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}

	public int getQuatity() {
		return quatity;
	}

	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "SugarCaneEntity [id=" + id + ", name=" + name + ", factoryName=" + factoryName + ", quatity=" + quatity
				+ ", cityName=" + cityName + "]";
	}

}
