package com.xworkz.cart;

public class CartDTO {

	private String name;
	private int quantity;
	private float price;
	private String iteams;

	public CartDTO() {
		System.out.println("invoked cartdto no arg");
	}

	public CartDTO(String name, int quantity, float price, String iteams) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.iteams = iteams;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getIteams() {
		return iteams;
	}

	public void setIteams(String iteams) {
		this.iteams = iteams;
	}

}
