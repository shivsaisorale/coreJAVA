package com.xworkz.dto;

import java.io.Serializable;

public class IcecreamDTO implements Serializable {
	private int id;
	private String flavour;
	private String name;
	private int price;

	public IcecreamDTO() {
		System.out.println("invoked no args const");
	}

	public IcecreamDTO(int id, String flavour, String name, int price) {
		super();
		this.id = id;
		this.flavour = flavour;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "IcecreamDTO [id=" + id + ", flavour=" + flavour + ", name=" + name + ", price=" + price + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
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

}
