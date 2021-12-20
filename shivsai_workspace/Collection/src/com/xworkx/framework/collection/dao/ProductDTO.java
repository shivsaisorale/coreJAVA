package com.xworkx.framework.collection.dao;

public class ProductDTO {

	private String id;
	private String name;
	private int price;
	private String manufacturer;

	public ProductDTO() {
		System.out.println("invoked no-args const");
	}

	public ProductDTO(String id, String name, int price, String manufacturer) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", price=" + price + ", manufacturer=" + manufacturer + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
}
