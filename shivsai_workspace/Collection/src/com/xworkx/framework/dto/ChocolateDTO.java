package com.xworkx.framework.dto;

import java.io.Serializable;

public class ChocolateDTO implements Serializable {

	private String brand, name;
	private int price;
	private float weight;

	public ChocolateDTO() {
		System.out.println("invoked no-arg const");
	}

	public ChocolateDTO(String brand, String name, int price, float weight) {
		super();
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		System.out.println("invoked hashcode of objects");
		return 4;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals methods of objects");
		if (obj != null) {
			if (obj instanceof ChocolateDTO) {
				ChocolateDTO casted = (ChocolateDTO) obj;
				if (this.brand.equals(casted.brand) && this.name.equals(casted.name)) {
					System.out.println("ChocolateDTO is same :".concat(brand));
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "ChocolateDTO [brand=" + brand + ", name=" + name + ", price=" + price + ", weight=" + weight + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
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

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
}
