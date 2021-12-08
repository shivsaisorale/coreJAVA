package com.xworkz.dp.dto;

public class CircusDTO {

	private String owner;
	private String material;
	private int ticketPrice;
	private int noOfAnimals;

	public CircusDTO(){
		System.out.println("Invoked IPLDTO no-arg const");
		
}

	public CircusDTO(String owner, String material, int ticketPrice, int noOfAnimals) {
		super();
		this.owner = owner;
		this.material = material;
		this.ticketPrice = ticketPrice;
		this.noOfAnimals = noOfAnimals;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getNoOfAnimals() {
		return noOfAnimals;
	}

	public void setNoOfAnimals(int noOfAnimals) {
		this.noOfAnimals = noOfAnimals;
	}

}