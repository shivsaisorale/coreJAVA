package com.xworkz.dp.dto;

public class ClubDTO {
	 
	private String name;
	private String noOfPeople;
	private String noOfBottle;
	private float rating;
	private float entryPrice;
	
	public ClubDTO() {
		System.out.println("no argument constructor invoked");
}

	public ClubDTO(String name, String noOfPeople, String noOfBottle, float rating, float entryPrice) {
		super();
		this.name = name;
		this.noOfPeople = noOfPeople;
		this.noOfBottle = noOfBottle;
		this.rating = rating;
		this.entryPrice = entryPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNoOfPeople() {
		return noOfPeople;
	}

	public void setNoOfPeople(String noOfPeople) {
		this.noOfPeople = noOfPeople;
	}

	public String getNoOfBottle() {
		return noOfBottle;
	}

	public void setNoOfBottle(String noOfBottle) {
		this.noOfBottle = noOfBottle;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public float getEntryPrice() {
		return entryPrice;
	}

	public void setEntryPrice(float entryPrice) {
		this.entryPrice = entryPrice;
	}


}

